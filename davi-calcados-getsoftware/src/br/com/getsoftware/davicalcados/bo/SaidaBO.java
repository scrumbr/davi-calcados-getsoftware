/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.SaidaDAO;
import br.com.getsoftware.davicalcados.entity.Saida;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class SaidaBO {

    
    public static Saida getById(Integer id) throws SQLException {
        SaidaDAO dao = new SaidaDAO();
        Saida saida = null;
        try {
            saida = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return saida;
    }

    public static void save(Saida saida) throws SQLException, Exception {
        SaidaDAO dao = new SaidaDAO();
        try {
            validator(saida);
            dao.save(saida);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Saida saida) throws SQLException, Exception {
        SaidaDAO dao = new SaidaDAO();
        try {
            validator(saida);
            dao.update(saida);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Saida> listAll() throws SQLException {
        SaidaDAO dao = new SaidaDAO();
        ArrayList<Saida> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    public static void delete(int id) throws SQLException {
        SaidaDAO dao = new SaidaDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(Saida saida) throws Exception {
       
    }
}
