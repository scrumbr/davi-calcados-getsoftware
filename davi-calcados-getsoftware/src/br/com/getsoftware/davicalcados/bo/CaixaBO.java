/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.CaixaDAO;
import br.com.getsoftware.davicalcados.entity.Caixa;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class CaixaBO {

    public static Caixa getById(Integer id) throws SQLException {
        CaixaDAO dao = new CaixaDAO();
        Caixa caixa = null;
        try {
            caixa = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return caixa;
    }

    public static void save(Caixa caixa) throws SQLException, Exception {
        CaixaDAO dao = new CaixaDAO();
        try {
            validator(caixa);
            dao.save(caixa);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Caixa caixa) throws SQLException, Exception {
        CaixaDAO dao = new CaixaDAO();
        try {
            validator(caixa);
            dao.update(caixa);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Caixa> listAll() throws SQLException {
        CaixaDAO dao = new CaixaDAO();
        ArrayList<Caixa> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }

    public static void delete(int id) throws SQLException {
        CaixaDAO dao = new CaixaDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(Caixa caixa) throws Exception {

    }
}
