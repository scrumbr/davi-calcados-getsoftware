
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.ContasReceberDAO;
import br.com.getsoftware.davicalcados.entity.ContasReceber;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class ContasReceberBO {
    
     public static ContasReceber getById(Integer id) throws SQLException {
        ContasReceberDAO dao = new ContasReceberDAO();
        ContasReceber contasReceber = null;
        try {
            contasReceber = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return contasReceber;
    }

    public static void save(ContasReceber contaReceber) throws SQLException {
        ContasReceberDAO dao = new ContasReceberDAO();
        try {
            //validator(contasReceber);
            dao.save(contaReceber);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(ContasReceber contasReceber) throws SQLException, Exception {
        ContasReceberDAO dao = new ContasReceberDAO();
        try {
            validator(contasReceber);
            dao.update(contasReceber);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<ContasReceber> listAll() throws SQLException {
        ContasReceberDAO dao = new ContasReceberDAO();
        ArrayList<ContasReceber> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
     public static ArrayList<ContasReceber> listAllTrue() throws SQLException {
        ContasReceberDAO dao = new ContasReceberDAO();
        ArrayList<ContasReceber> minhaLista = null;
        try {
            minhaLista = dao.listAllTrue();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
      public static ArrayList<ContasReceber> listAllFalse() throws SQLException {
        ContasReceberDAO dao = new ContasReceberDAO();
        ArrayList<ContasReceber> minhaLista = null;
        try {
            minhaLista = dao.listAllFalse();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    
    
    public static void delete(int id) throws SQLException {
        ContasReceberDAO dao = new ContasReceberDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(ContasReceber contasReceber) throws Exception {
        
    }
    
    
    
}
