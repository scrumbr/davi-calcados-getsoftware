
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.ContasPagar;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import br.com.getsoftware.davicalcados.util.TransformDate;
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
            
        contasPagar.setDataPagamento(TransformDate.transformDate(res.getString("data_entrada")));
        contasPagar.setDescricao(res.getString("descricao_entrada"));
        contasPagar.setIdContaPagar(Long.valueOf(res.getString("id_entrada")));
        contasPagar.setValor(Double.valueOf(res.getString("valor_entrada")));
        contasPagar.setStatus(res.getBoolean("status"));
        }
        
        res.close();
        stmt.close();

        return contasPagar;
    }

    @Override
    public void save(ContasPagar contaPagar) throws SQLException {
        String sql = "insert into contas_pagar( descricao, valor, data_pagamento, status )"
                + " values ( ?, ?, ?, ?)";
         try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
             stmt.setString(1, contaPagar.getDescricao());
             stmt.setDouble(2, contaPagar.getValor());
             stmt.setString(3, TransformDate.transformDate(contaPagar.getDataPagamento()));
             stmt.setBoolean(4, contaPagar.getStatus());
             
             stmt.execute();
         }
    }

    @Override
    public void update(ContasPagar contasPagar) throws SQLException {
        String sql = "update contas_pagar set id_contas_pagar, descricao, valor, data_pagamento, status "
                + " where id_contas_pagar=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, contasPagar.getIdContaPagar());
        stmt.setString(2, contasPagar.getDescricao());
        stmt.setDouble(3, contasPagar.getValor());
        stmt.setString(4, TransformDate.transformDate(contasPagar.getDataPagamento()));
        stmt.setBoolean(5, contasPagar.getStatus());
        stmt.setLong(6, contasPagar.getIdContaPagar());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<ContasPagar> listAll() throws SQLException {
        String sql = "select * from contas_pagar";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ContasPagar> minhaLista = new ArrayList<>();
        while (res.next()) {
            ContasPagar contasPagar = new ContasPagar();

            contasPagar.setIdContaPagar(Long.valueOf(res.getString("id_contas_pagar")));
            contasPagar.setDescricao((res.getString("descricao")));
            contasPagar.setValor(Double.valueOf(res.getString("valor")));
            contasPagar.setDataPagamento((res.getString("data_pagamento")));
            contasPagar.setIdContaPagar(Long.valueOf(res.getString("id_contas_pagar")));

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

  
    
}
