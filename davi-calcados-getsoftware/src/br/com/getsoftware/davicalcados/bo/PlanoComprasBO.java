/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.PlanoComprasDAO;
import br.com.getsoftware.davicalcados.entity.PlanoCompras;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class PlanoComprasBO {
    
      public static PlanoCompras getById(Integer id) throws SQLException {
        PlanoComprasDAO dao = new PlanoComprasDAO();
        PlanoCompras planoCompras = null;
        try {
            planoCompras = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return planoCompras;
    }

    public static void save(PlanoCompras planoCompras) throws SQLException, Exception {
        PlanoComprasDAO dao = new PlanoComprasDAO();
        try {
            validator(planoCompras);
            dao.save(planoCompras);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(PlanoCompras planoCompras) throws SQLException, Exception {
        PlanoComprasDAO dao = new PlanoComprasDAO();
        try {
            validator(planoCompras);
            dao.update(planoCompras);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<PlanoCompras> listAll() throws SQLException {
        PlanoComprasDAO dao = new PlanoComprasDAO();
        ArrayList<PlanoCompras> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    public static void delete(int id) throws SQLException {
        PlanoComprasDAO dao = new PlanoComprasDAO();
        try {
            dao.delete(id);          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(PlanoCompras planoCompras) throws Exception {
        if(planoCompras.getNome().isEmpty() || planoCompras.getNome()==null){
            JOptionPane.showMessageDialog(null, "");
        }
    }
}
