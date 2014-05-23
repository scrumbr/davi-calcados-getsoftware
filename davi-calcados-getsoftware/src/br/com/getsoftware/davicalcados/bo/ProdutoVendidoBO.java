/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.ProdutoVendidoDAO;
import br.com.getsoftware.davicalcados.entity.ProdutoVendido;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class ProdutoVendidoBO {

    public static ProdutoVendido getById(Integer id) throws SQLException {
        ProdutoVendidoDAO dao = new ProdutoVendidoDAO();
        ProdutoVendido prod = null;
        try {
            prod = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return prod;
    }

    public static void save(ProdutoVendido prod) throws SQLException, Exception {
        ProdutoVendidoDAO dao = new ProdutoVendidoDAO();
        try {
            validator(prod);
            dao.save(prod);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(ProdutoVendido prod) throws SQLException, Exception {
        ProdutoVendidoDAO dao = new ProdutoVendidoDAO();
        try {
            validator(prod);
            dao.update(prod);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<ProdutoVendido> listAll() throws SQLException {
        ProdutoVendidoDAO dao = new ProdutoVendidoDAO();
        ArrayList<ProdutoVendido> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }

    public static void delete(int id) throws SQLException {
        ProdutoVendidoDAO dao = new ProdutoVendidoDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(ProdutoVendido prod) throws Exception {

    }
}
