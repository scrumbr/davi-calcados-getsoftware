/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.EntradaDAO;
import br.com.getsoftware.davicalcados.entity.Entrada;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class EntradaBO {

    public static Entrada getById(Integer id) throws SQLException {
        EntradaDAO dao = new EntradaDAO();
        Entrada entrada = null;
        try {
            entrada = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return entrada;
    }

    public static void save(Entrada entrada) throws SQLException, Exception {
        EntradaDAO dao = new EntradaDAO();
        try {
            validator(entrada);
            dao.save(entrada);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Entrada entrada) throws SQLException, Exception {
        EntradaDAO dao = new EntradaDAO();
        try {
            validator(entrada);
            dao.update(entrada);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Entrada> listAll() throws SQLException {
        EntradaDAO dao = new EntradaDAO();
        ArrayList<Entrada> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
      public static ArrayList<Entrada> listAllDate(String de, String ate) throws SQLException {
        EntradaDAO dao = new EntradaDAO();
        ArrayList<Entrada> minhaLista = null;
        try {
            minhaLista = dao.listAllDate(de, ate);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    public static void delete(int id) throws SQLException {
        EntradaDAO dao = new EntradaDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(Entrada entrada) throws Exception {
        
    }
}
