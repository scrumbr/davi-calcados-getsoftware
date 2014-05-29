
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.ContasPagarDAO;
import br.com.getsoftware.davicalcados.entity.ContasPagar;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gois
 */
public class ContasPagarBO {
    
     public static ContasPagar getById(Integer id) throws SQLException {
        ContasPagarDAO dao = new ContasPagarDAO();
        ContasPagar contasPagar = null;
        try {
            contasPagar = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return contasPagar;
    }

    public static void save(ContasPagar contaPagar) throws SQLException {
        ContasPagarDAO dao = new ContasPagarDAO();
        try {
            //validator(contasPagar);
            dao.save(contaPagar);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(ContasPagar contasPagar) throws SQLException, Exception {
        ContasPagarDAO dao = new ContasPagarDAO();
        try {
            validator(contasPagar);
            dao.update(contasPagar);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<ContasPagar> listAll() throws SQLException {
        ContasPagarDAO dao = new ContasPagarDAO();
        ArrayList<ContasPagar> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
     public static ArrayList<ContasPagar> listAllTrue() throws SQLException {
        ContasPagarDAO dao = new ContasPagarDAO();
        ArrayList<ContasPagar> minhaLista = null;
        try {
            minhaLista = dao.listAllTrue();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
      public static ArrayList<ContasPagar> listAllFalse() throws SQLException {
        ContasPagarDAO dao = new ContasPagarDAO();
        ArrayList<ContasPagar> minhaLista = null;
        try {
            minhaLista = dao.listAllFalse();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    
    
    public static void delete(int id) throws SQLException {
        ContasPagarDAO dao = new ContasPagarDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(ContasPagar contasPagar) throws Exception {
        
    }
    
    
    
}
