package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.ContasReceber;
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
public class ContasReceberDAO implements InterfaceCRUD<ContasReceber> {

    private Connection conexao;

    public ContasReceberDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    @Override
    public ContasReceber getById(Integer id) throws SQLException {

        String sql = "select * from contas_receber where id_contas_receber = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();

        ContasReceber contasReceber = new ContasReceber();
        if (res.next()) {
            contasReceber.setDataPagamento(TransformDate.transformDate(res.getString("data_pagamento")));
            contasReceber.setDescricao(res.getString("descricao"));
            contasReceber.setIdContaReceber(Long.valueOf(res.getString("id_contas_receber")));
            contasReceber.setValor(Double.valueOf(res.getString("valor")));
            contasReceber.setStatus(res.getBoolean("status"));
            contasReceber.setIdVenda(res.getLong("id_venda"));
            contasReceber.setDataQuitado(TransformDate.transformDate(res.getString("data_quitado")));

        }

        res.close();
        stmt.close();

        return contasReceber;
    }

    @Override
    public void save(ContasReceber contaReceber) throws SQLException {
        String sql = "insert into contas_receber( descricao, valor, data_pagamento, status, data_quitado, id_venda)"
                + " values ( ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            stmt.setString(1, contaReceber.getDescricao());
            stmt.setDouble(2, contaReceber.getValor());
            stmt.setString(3, TransformDate.transformDate(contaReceber.getDataPagamento()));
            stmt.setBoolean(4, contaReceber.getStatus());
            stmt.setString(5, contaReceber.getDataQuitado());
            stmt.setLong(6, contaReceber.getIdVenda());

            stmt.execute();
        }
    }

    @Override
    public void update(ContasReceber contasReceber) throws SQLException {
        String sql = "update contas_receber set  descricao=?, valor=?, data_pagamento=?, status=?, data_quitado=?, id_venda=?  "
                + " where id_contas_receber=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, contasReceber.getDescricao());
        stmt.setDouble(2, contasReceber.getValor());
        stmt.setString(3, TransformDate.transformDate(contasReceber.getDataPagamento()));
        stmt.setBoolean(4, contasReceber.getStatus());
        stmt.setString(5, contasReceber.getDataQuitado());
        stmt.setLong(6, contasReceber.getIdVenda());
        stmt.setLong(7, contasReceber.getIdContaReceber());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<ContasReceber> listAll() throws SQLException {
        String sql = "select * from contas_receber order by data_pagamento";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ContasReceber> minhaLista = new ArrayList<>();
        while (res.next()) {
            ContasReceber contasReceber = new ContasReceber();

            contasReceber.setIdContaReceber(Long.valueOf(res.getString("id_contas_receber")));
            contasReceber.setDescricao((res.getString("descricao")));
            contasReceber.setValor(Double.parseDouble(res.getString("valor")));
            contasReceber.setDataPagamento(res.getString("data_pagamento"));
            contasReceber.setDataQuitado(res.getString("data_quitado"));
            contasReceber.setStatus((res.getBoolean("status")));
            contasReceber.setIdVenda(res.getLong("id_venda"));
            minhaLista.add(contasReceber);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from contas_receber where id_contas_receber=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }

    public ArrayList<ContasReceber> listAllTrue() throws SQLException {
        String sql = "select * from contas_receber where status = true order by data_pagamento;";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ContasReceber> minhaLista = new ArrayList<>();
        while (res.next()) {
            ContasReceber contasReceber = new ContasReceber();

            contasReceber.setIdContaReceber(Long.valueOf(res.getString("id_contas_receber")));
            contasReceber.setDescricao((res.getString("descricao")));
            contasReceber.setValor(Double.parseDouble(res.getString("valor")));
            contasReceber.setDataPagamento(res.getString("data_pagamento"));
            contasReceber.setDataQuitado(res.getString("data_quitado"));
            contasReceber.setStatus((res.getBoolean("status")));
            contasReceber.setIdVenda(res.getLong("id_venda"));
            minhaLista.add(contasReceber);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    public ArrayList<ContasReceber> listAllFalse() throws SQLException {
        String sql = "select * from contas_receber where status = false order by data_pagamento;";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ContasReceber> minhaLista = new ArrayList<>();
        while (res.next()) {
            ContasReceber contasReceber = new ContasReceber();

            contasReceber.setIdContaReceber(Long.valueOf(res.getString("id_contas_receber")));
            contasReceber.setDescricao((res.getString("descricao")));
            contasReceber.setValor(Double.parseDouble(res.getString("valor")));
            contasReceber.setDataPagamento(res.getString("data_pagamento"));
            contasReceber.setDataQuitado(res.getString("data_quitado"));
            contasReceber.setStatus((res.getBoolean("status")));
            contasReceber.setIdVenda(res.getLong("id_venda"));
            minhaLista.add(contasReceber);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

}
