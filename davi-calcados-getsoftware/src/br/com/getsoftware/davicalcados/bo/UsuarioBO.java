/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.UsuarioDAO;
import br.com.getsoftware.davicalcados.entity.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class UsuarioBO {
    public static Usuario getById(Integer id) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = null;
        try {
            usuario = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return usuario;
    }
    
      public static Usuario validate(String cpf, String senha) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = null;
        try {
            usuario = dao.validate(cpf, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return usuario;
    }

    public static void save(Usuario usuario) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        try {
            validator(usuario);
            dao.save(usuario);
//            JOptionPane.showMessageDialog(null, "Sucesso ao salvar o registro\n", "Salvo com sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Usuario usuario) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        try {
            validator(usuario);
            dao.update(usuario);
//            JOptionPane.showMessageDialog(null, "Sucesso ao atualizar o registro\n", "Atualizado com sucesso", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Usuario> listAll() throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList<Usuario> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }

    public static void delete(int id) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        try {
//            int opc = JOptionPane.showConfirmDialog(null, "Deseja Excluir o registro ?", "Excluir", JOptionPane.YES_NO_OPTION);
//            if (opc == JOptionPane.YES_OPTION) {
                dao.delete(id);
//                JOptionPane.showMessageDialog(null, "Sucesso ao excluir o registro\n", "Excluido com sucesso", 1);
//            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(Usuario usuario) {

    }
}
