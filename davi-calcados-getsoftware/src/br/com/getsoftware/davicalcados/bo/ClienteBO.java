/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.ClienteDAO;
import br.com.getsoftware.davicalcados.entity.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class ClienteBO {
      public static Cliente getById(Integer id) throws SQLException {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = null;
        try {
            cliente = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return cliente;
    }

    public static void save(Cliente cliente) throws SQLException, Exception {
        ClienteDAO dao = new ClienteDAO();
        try {
            validator(cliente);
            dao.save(cliente);
            //JOptionPane.showMessageDialog(null, "Sucesso ao salvar o registro\n", "Salvo com sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Cliente cliente) throws SQLException, Exception {
        ClienteDAO dao = new ClienteDAO();
        try {
            validator(cliente);
            dao.update(cliente);
           // JOptionPane.showMessageDialog(null, "Sucesso ao atualizar o registro\n", "Atualizado com sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Cliente> listAll() throws SQLException {
        ClienteDAO dao = new ClienteDAO();
        ArrayList<Cliente> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    public static void delete(int id) throws SQLException {
        ClienteDAO dao = new ClienteDAO();
        try {
            int opc = JOptionPane.showConfirmDialog(null, "Deseja Excluir o registro ?", "Excluir", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.YES_OPTION) {
                dao.delete(id);
                JOptionPane.showMessageDialog(null, "Sucesso ao excluir o registro\n", "Excluido com sucesso", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(Cliente cliente) throws Exception {
        if(cliente.getNome().isEmpty() || cliente.getNome()==null){
            JOptionPane.showMessageDialog(null, "");
        }
    }
    
}
