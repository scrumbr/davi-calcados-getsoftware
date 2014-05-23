/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.ProdutoVendido;
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
public class ProdutoVendidoDAO implements InterfaceCRUD<ProdutoVendido>{
    
    private Connection conexao;

    public ProdutoVendidoDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    //id, id_produto_vendido, id_produto 
    @Override
    public ProdutoVendido getById(Integer id) throws SQLException {
        ProdutoVendido produto_vendido = null;
        String sql = "select * from produto_vendido where id = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();

        if (res.next()) {
            produto_vendido = new ProdutoVendido();

            produto_vendido.setId(res.getLong("id"));
            produto_vendido.setId_produto(res.getLong("id_produto"));
            produto_vendido.setId_venda(res.getLong("id_venda"));
        }

        res.close();
        stmt.close();

        return produto_vendido;
    }

    @Override
    public void save(ProdutoVendido produto_vendido) throws SQLException {
        String sql = "insert into produto_vendido(id, id_produto, id_venda )"
                + " values (?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, produto_vendido.getId());
        stmt.setLong(2, produto_vendido.getId_produto());
        stmt.setDouble(3, produto_vendido.getId_venda());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(ProdutoVendido produto_vendido) throws SQLException {
        String sql = "update produto_vendido set id_produto=?, id_venda=? where id=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, produto_vendido.getId());
        stmt.setLong(2, produto_vendido.getId_produto());
        stmt.setDouble(3, produto_vendido.getId_venda());
        stmt.setDouble(4, produto_vendido.getId());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<ProdutoVendido> listAll() throws SQLException {
        String sql = "select * from produto_vendido where data = current_date() order by hora desc";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<ProdutoVendido> minhaLista = new ArrayList<>();
        while (res.next()) {
            ProdutoVendido produto_vendido = new ProdutoVendido();

            produto_vendido.setId(res.getLong("id"));
            produto_vendido.setId_produto(res.getLong("id_produto"));
            produto_vendido.setId_venda(res.getLong("id__venda"));

            minhaLista.add(produto_vendido);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from produto_vendido where id=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }

}
