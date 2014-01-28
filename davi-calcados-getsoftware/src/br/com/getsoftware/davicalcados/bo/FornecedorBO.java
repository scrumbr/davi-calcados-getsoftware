/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.FornecedorDAO;
import br.com.getsoftware.davicalcados.entity.Fornecedor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class FornecedorBO {
    
    public static Fornecedor getById(Integer id) throws SQLException {
        FornecedorDAO dao = new FornecedorDAO();
        Fornecedor fornecedor = null;
        try {
            fornecedor = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return fornecedor;
    }

    public static void save(Fornecedor fornecedor) throws SQLException, Exception {
        FornecedorDAO dao = new FornecedorDAO();
        try {
            validator(fornecedor);
            dao.save(fornecedor);
            //JOptionPane.showMessageDialog(null, "Sucesso ao salvar o registro\n", "Salvo com sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Fornecedor fornecedor) throws SQLException, Exception {
        FornecedorDAO dao = new FornecedorDAO();
        try {
            validator(fornecedor);
            dao.update(fornecedor);
           // JOptionPane.showMessageDialog(null, "Sucesso ao atualizar o registro\n", "Atualizado com sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Fornecedor> listAll() throws SQLException {
        FornecedorDAO dao = new FornecedorDAO();
        ArrayList<Fornecedor> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    public static void delete(int id) throws SQLException {
        FornecedorDAO dao = new FornecedorDAO();
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

    public static void validator(Fornecedor fornecedor) throws Exception {
        if(fornecedor.getNome().isEmpty() || fornecedor.getNome()==null){
            JOptionPane.showMessageDialog(null, "");
        }
    }
    
}
