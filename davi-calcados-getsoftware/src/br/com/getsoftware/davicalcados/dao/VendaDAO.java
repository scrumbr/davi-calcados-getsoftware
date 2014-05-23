/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Venda;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wilton
 */
public class VendaDAO implements InterfaceCRUD<Venda> {

    private Connection conexao;

    public VendaDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    //id_funcionario, id_cliente, data, parcelas, total
    @Override
    public Venda getById(Integer id) throws SQLException {
        Venda venda = null;
        String sql = "select * from venda where id = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();

        if (res.next()) {
            venda = new Venda();

//            venda.setDescricao(sql);
            venda.setIdCliente(res.getLong("id_cliente"));
            venda.setIdFuncionario(res.getInt("id_funcionario"));
            venda.setIdVenda(res.getInt("id"));
            venda.setValorTotal(res.getDouble("total"));
            venda.setData(res.getString("data"));
            venda.setParcela(res.getInt("parcela"));
        }//id_venda,id_movimentacao,movimentacao,descricao,data_hora,id_usuario,valor,

        res.close();
        stmt.close();

        return venda;
    }

    @Override
    public void save(Venda venda) throws SQLException {
        String sql = "insert into venda(id_funcionario, id_cliente, data, parcela, total)"
                + " values (?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setInt(1, venda.getIdFuncionario());
        stmt.setLong(2, venda.getIdCliente());
        stmt.setString(3, venda.getData());
        stmt.setInt(4, venda.getParcela());
        stmt.setDouble(5, venda.getValorTotal());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Venda venda) throws SQLException {
        String sql = "update venda set movimentacao=?, descricao=?, data=?, hora=?, username=?, valor=?, id_movimentacao=? "
                + " where id=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setInt(1, venda.getIdFuncionario());
        stmt.setLong(2, venda.getIdCliente());
        stmt.setString(3, venda.getData());
        stmt.setInt(4, venda.getParcela());
        stmt.setDouble(5, venda.getValorTotal());
        stmt.setInt(6, venda.getIdVenda());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Venda> listAll() throws SQLException {
        String sql = "select * from venda where data = current_date() order by hora desc";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Venda> minhaLista = new ArrayList<>();
        while (res.next()) {
            Venda venda = new Venda();

            venda.setIdCliente(res.getLong("id_cliente"));
            venda.setIdFuncionario(res.getInt("id_funcionario"));
            venda.setIdVenda(res.getInt("id"));
            venda.setValorTotal(res.getDouble("total"));
            venda.setData(res.getString("data"));
            venda.setParcela(res.getInt("parcela"));

            minhaLista.add(venda);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from venda where id=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }

}
