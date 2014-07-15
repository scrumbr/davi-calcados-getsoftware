/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.VendaDAO;
import br.com.getsoftware.davicalcados.entity.Venda;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class VendaBO {

    public static Venda getById(Integer id) throws SQLException {
        VendaDAO dao = new VendaDAO();
        Venda venda = null;
        try {
            venda = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return venda;
    }

    public static void save(Venda venda) throws SQLException, Exception {
        VendaDAO dao = new VendaDAO();
        
            validator(venda);
            dao.save(venda);
        
    }

    public static void update(Venda venda) throws SQLException, Exception {
        VendaDAO dao = new VendaDAO();
        try {
            validator(venda);
            dao.update(venda);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Venda> listAll() throws SQLException {
        VendaDAO dao = new VendaDAO();
        ArrayList<Venda> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }

    public static void delete(int id) throws SQLException {
        VendaDAO dao = new VendaDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(Venda venda) throws Exception {

    }
}
