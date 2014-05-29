
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.ContasPagar;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import br.com.getsoftware.davicalcados.util.TransformDate;
import br.com.getsoftware.davicalcados.util.TransformMoeda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andrey Gois
 */
public class ContasPagarDAO implements InterfaceCRUD<ContasPagar>{
    
     private Connection conexao;

    public ContasPagarDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    @Override
    public ContasPagar getById(Integer id) throws SQLException {
        
        String sql = "select * from contas_pagar where id_contas_pagar = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();
        
        ContasPagar contasPagar = new ContasPagar();
        if(res.next()){        
        contasPagar.setDataPagamento(TransformDate.transformDate(res.getString("data_pagamento")));
        contasPagar.setDescricao(res.getString("descricao"));
        contasPagar.setIdContaPagar(Long.valueOf(res.getString("id_contas_pagar")));
        contasPagar.setValor(Double.valueOf(res.getString("valor")));
        contasPagar.setStatus(res.getBoolean("status"));       
        contasPagar.setDataQuitado(TransformDate.transformDate(res.getString("data_quitado")));
            
        }
        
        res.close();
        stmt.close();

        return contasPagar;
    }

    @Override
    public void save(ContasPagar contaPagar) throws SQLException {
        String sql = "insert into contas_pagar( descricao, valor, data_pagamento, status, data_quitado)"
                + " values ( ?, ?, ?, ?,?)";
         try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
             stmt.setString(1, contaPagar.getDescricao());
             stmt.setDouble(2, contaPagar.getValor());
             stmt.setString(3, TransformDate.transformDate(contaPagar.getDataPagamento()));
             stmt.setBoolean(4, contaPagar.getStatus());
             stmt.setString(5, contaPagar.getDataQuitado());
             
             stmt.execute();
         }
    }

    @Override
    public void update(ContasPagar contasPagar) throws SQLException {
        String sql = "update contas_pagar set  descricao=?, valor=?, data_pagamento=?, status=?, data_quitado=? "
                + " where id_contas_pagar=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, contasPagar.getDescricao());
        stmt.setDouble(2, contasPagar.getValor());
        stmt.setString(3, TransformDate.transformDate(contasPagar.getDataPagamento()));
        stmt.setBoolean(4, contasPagar.getStatus());
        stmt.setString(5, contasPagar.getDataQuitado());
        stmt.setLong(6, contasPagar.getIdContaPagar());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<ContasPagar> listAll() throws SQLException {
        String sql = "select * from contas_pagar order by data_pagamento";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ContasPagar> minhaLista = new ArrayList<>();
        while (res.next()) {
            ContasPagar contasPagar = new ContasPagar();

            contasPagar.setIdContaPagar(Long.valueOf(res.getString("id_contas_pagar")));
            contasPagar.setDescricao((res.getString("descricao")));
            contasPagar.setValor(Double.parseDouble(res.getString("valor")));
            contasPagar.setDataPagamento(res.getString("data_pagamento"));
            contasPagar.setDataQuitado(res.getString("data_quitado"));
            contasPagar.setStatus((res.getBoolean("status")));
            minhaLista.add(contasPagar);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from contas_pagar where id_contas_pagar=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }

   public ArrayList<ContasPagar> listAllTrue() throws SQLException {
        String sql = "select * from contas_pagar where status = true order by data_pagamento;";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ContasPagar> minhaLista = new ArrayList<>();
        while (res.next()) {
            ContasPagar contasPagar = new ContasPagar();

            contasPagar.setIdContaPagar(Long.valueOf(res.getString("id_contas_pagar")));
            contasPagar.setDescricao((res.getString("descricao")));
            contasPagar.setValor(Double.parseDouble(res.getString("valor")));
            contasPagar.setDataPagamento(res.getString("data_pagamento"));
            contasPagar.setDataQuitado(res.getString("data_quitado"));
            contasPagar.setStatus((res.getBoolean("status")));
            minhaLista.add(contasPagar);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }
    
    public ArrayList<ContasPagar> listAllFalse() throws SQLException {
        String sql = "select * from contas_pagar where status = false order by data_pagamento;";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ContasPagar> minhaLista = new ArrayList<>();
        while (res.next()) {
            ContasPagar contasPagar = new ContasPagar();

            contasPagar.setIdContaPagar(Long.valueOf(res.getString("id_contas_pagar")));
            contasPagar.setDescricao((res.getString("descricao")));
            contasPagar.setValor(Double.parseDouble(res.getString("valor")));
            contasPagar.setDataPagamento(res.getString("data_pagamento"));
            contasPagar.setDataQuitado(res.getString("data_quitado"));
            contasPagar.setStatus((res.getBoolean("status")));
            minhaLista.add(contasPagar);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }
    
   
   
}
