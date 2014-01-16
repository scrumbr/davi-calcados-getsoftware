/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.connection.Conexao;
import br.com.getsoftware.davicalcados.entity.Produto;
import br.com.getsoftware.davicalcados.myinterface.InterfaceCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * @author Junior Oliveira
 */

public class ProdutoDAO implements InterfaceCRUD<Produto> {

    private Connection conexao;

    public ProdutoDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }
    /*
     ** atributos da table PRODUTO
     id_produto, id_usuario, descricao, quantidade, valor_unitario, valor_venda
     */

    @Override
    public Produto getById(Integer id) throws SQLException {
        Produto produto = new Produto();
        String sql = "select * from produto where id_produto = " + id;
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet res = stmt.executeQuery();

        produto.setDescricao(res.getString("descricao"));
        produto.setIdProduto(res.getLong("id_produto"));
        produto.setIdUsuario(res.getLong("id_usuario"));
        produto.setQuantidade(res.getInt("quantidade"));
        produto.setValorUnitario(res.getDouble("valor_unitario"));
        produto.setValorVenda(res.getDouble("valor_venda"));

        stmt.execute();
        stmt.close();

        return produto;
    }

    @Override
    public void save(Produto produto) throws SQLException {
        String sql = "insert into produto(id_usuario, descricao, quantidade, valor_unitario, valor_venda) "
                + " values (?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, produto.getIdUsuario());
        stmt.setString(2, produto.getDescricao());
        stmt.setLong(3, produto.getQuantidade());
        stmt.setDouble(4, produto.getValorUnitario());
        stmt.setDouble(5, produto.getValorVenda());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Produto produto) throws SQLException {
        String sql = "update produto set id_usuario=?, descricao=?, quantidade=?, valor_unitario=?, valor_venda=?"
                + " where id_produto=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, produto.getIdUsuario());
        stmt.setString(2, produto.getDescricao());
        stmt.setLong(3, produto.getQuantidade());
        stmt.setDouble(4, produto.getValorUnitario());
        stmt.setDouble(5, produto.getValorVenda());
        stmt.setLong(6, produto.getIdProduto());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Produto> listAll() throws SQLException {
        String sql = "select * from produto order by descricao";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Produto> minhaLista = new ArrayList<>();
        while (res.next()) {
            Produto produto = new Produto();

            produto.setDescricao(res.getString("descricao"));
            produto.setIdProduto(res.getLong("id_produto"));
            produto.setIdUsuario(res.getLong("id_usuario"));
            produto.setQuantidade(res.getInt("quantidade"));
            produto.setValorUnitario(res.getDouble("valor_unitario"));
            produto.setValorVenda(res.getDouble("valor_venda"));

            minhaLista.add(produto);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from produto where id_produto=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }
}
