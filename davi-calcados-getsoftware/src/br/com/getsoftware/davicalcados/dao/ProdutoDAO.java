 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.dao;

import br.com.getsoftware.davicalcados.bo.FornecedorBO;
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
    //id_produto, id_usuario ,id_fornecedor,nome, descricao, quantidade, quantidade_minima, valor_unitario ,valor_venda 

    @Override
    public Produto getById(Integer id) throws SQLException {

        String sql = "select * from produto where id_produto = " + id;
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet res = stmt.executeQuery();

        Produto produto = null;

        if (res.next()) {
            produto = new Produto();
            produto.setDescricao(res.getString("descricao"));
            produto.setIdProduto(res.getInt("id_produto"));
            produto.setFornecedor(FornecedorBO.getById(res.getInt("id_fornecedor")));
            produto.setQuantidade(res.getInt("quantidade"));
            produto.setQuantidadeMinima(res.getInt("quantidade_minima"));
            produto.setValorUnitario(res.getDouble("valor_unitario"));
            produto.setValorVenda(res.getDouble("valor_venda"));
            produto.setNome(res.getString("nome"));
            produto.setQtdAumento(res.getDouble("valor_aumento"));
        }
        res.close();
        stmt.close();
        return produto;
    }

    @Override
    public void save(Produto produto) throws SQLException {
        //id_produto, id_usuario ,id_fornecedor,nome, descricao, quantidade, quantidade_minima, valor_unitario ,valor_venda 

        String sql = "insert into produto( nome, descricao, quantidade, quantidade_minima, valor_unitario, valor_venda, id_fornecedor,valor_aumento) "
                + " values ( ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, produto.getNome());
        stmt.setString(2, produto.getDescricao());
        stmt.setLong(3, produto.getQuantidade());
        stmt.setLong(4, produto.getQuantidadeMinima());
        stmt.setDouble(5, produto.getValorUnitario());
        stmt.setDouble(6, produto.getValorVenda());
        stmt.setDouble(7, produto.getFornecedor().getIdFornecedor());
        stmt.setDouble(8, produto.getQtdAumento());

        stmt.execute();
        stmt.close();
    }

    @Override
    public void update(Produto produto) throws SQLException {
        //id_produto, id_usuario ,id_fornecedor,nome, descricao, quantidade, quantidade_minima, valor_unitario ,valor_venda 
        String sql = "update produto set id_fornecedor=?, nome=?, descricao=?, quantidade=?, quantidade_minima=?, valor_unitario=?, valor_venda=?, valor_aumento=?"
                + "  where id_produto=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setLong(1, produto.getFornecedor().getIdFornecedor());
        stmt.setString(2, produto.getNome());
        stmt.setString(3, produto.getDescricao());
        stmt.setLong(4, produto.getQuantidade());
        stmt.setLong(5, produto.getQuantidadeMinima());
        stmt.setDouble(6, produto.getValorUnitario());
        stmt.setDouble(7, produto.getValorVenda());
        stmt.setDouble(8,produto.getQtdAumento());
        stmt.setLong(9, produto.getIdProduto());

        stmt.execute();
        stmt.close();
    }

    @Override
    public ArrayList<Produto> listAll() throws SQLException {
        String sql = "select * from produto";
              
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Produto> minhaLista = new ArrayList<>();
        while (res.next()) {
            Produto produto = new Produto();
          
            produto.setDescricao(res.getString("descricao"));
            produto.setIdProduto(res.getInt("id_produto"));
            produto.setFornecedor(FornecedorBO.getById(res.getInt("id_fornecedor")));
            produto.setQuantidade(res.getInt("quantidade"));
            produto.setQuantidadeMinima(res.getInt("quantidade_minima"));
            produto.setValorUnitario(res.getDouble("valor_unitario"));
            produto.setValorVenda(res.getDouble("valor_venda"));
            produto.setNome(res.getString("nome"));
            produto.setQtdAumento(res.getDouble("valor_aumento"));
            
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
