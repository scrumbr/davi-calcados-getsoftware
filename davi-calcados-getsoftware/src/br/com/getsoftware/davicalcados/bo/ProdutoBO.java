/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;


import br.com.getsoftware.davicalcados.dao.ProdutoDAO;
import br.com.getsoftware.davicalcados.entity.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class ProdutoBO {

    public static Produto getById(String id) throws SQLException {
        ProdutoDAO dao = new ProdutoDAO();
        Produto produto = null;
        try {
            if (dao.getById(id) == null) {
                return null;
            } else {
                produto = dao.getById(id);
                return produto;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
            return null;
        }

    }

    public static void save(Produto produto) throws SQLException {
        ProdutoDAO dao = new ProdutoDAO();
        try {
            validator(produto);
            dao.save(produto);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Produto produto) throws SQLException{
        ProdutoDAO dao = new ProdutoDAO();
        try {
            validator(produto);
            dao.update(produto);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Produto> listAll() throws SQLException {
        ProdutoDAO dao = new ProdutoDAO();
        ArrayList<Produto> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }

    public static void delete(String id) throws SQLException {
        ProdutoDAO dao = new ProdutoDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

     public static void updateStock(int id, String codigo) throws SQLException {
        ProdutoDAO dao = new ProdutoDAO();
        try {
            dao.atualizaEstoque(id, codigo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }
    public static void validator(Produto produto) {
 
    }
}
