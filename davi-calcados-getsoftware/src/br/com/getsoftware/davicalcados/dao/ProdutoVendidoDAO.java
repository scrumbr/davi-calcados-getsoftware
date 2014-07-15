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
public class ProdutoVendidoDAO implements InterfaceCRUD<ProdutoVendido> {

    private Connection conexao;

    public ProdutoVendidoDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    //id, id_produto_vendido, id_produto 
    @Override
    public ProdutoVendido getById(Integer id) throws SQLException {
        ProdutoVendido produtoVendido = null;
        String sql = "select * from produto_vendido where id = ? ";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet res = stmt.executeQuery();

        if (res.next()) {
            produtoVendido = new ProdutoVendido();

            produtoVendido.setId(res.getLong("id"));
            produtoVendido.setId_produto(res.getString("id_produto"));
            produtoVendido.setId_venda(res.getLong("id_venda"));
            produtoVendido.setQuantidade(res.getInt("quantidade"));
        }

        res.close();
        stmt.close();

        return produtoVendido;
    }

    @Override
    public void save(ProdutoVendido produtoVendido) throws SQLException {
        String sql = "insert into produto_vendido( id_produto, id_venda, quantidade )"
                + " values ( ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

         stmt.setString(1, produtoVendido.getId_produto());
         stmt.setLong(2, produtoVendido.getId_venda());
         stmt.setInt(3, produtoVendido.getQuantidade());
         
        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(ProdutoVendido produtoVendido) throws SQLException {
        String sql = "update produto_vendido set id_produto=?, id_venda=?, quantidade=? where id=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

         stmt.setString(1, produtoVendido.getId_produto());
        stmt.setDouble(2, produtoVendido.getId_venda());
        stmt.setInt(3, produtoVendido.getQuantidade());
        stmt.setDouble(4, produtoVendido.getId());

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
            ProdutoVendido produtoVendido = new ProdutoVendido();

            produtoVendido.setId(res.getLong("id"));
            produtoVendido.setId_produto(res.getString("id_produto"));
            produtoVendido.setId_venda(res.getLong("id__venda"));
            produtoVendido.setQuantidade(res.getInt("quantidade"));

            minhaLista.add(produtoVendido);
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
