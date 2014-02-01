/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.dao.FuncionarioDAO;
import br.com.getsoftware.davicalcados.entity.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class FuncionarioBO {

    public static Funcionario getById(Integer id) throws SQLException {
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario funcionario = null;
        try {
            funcionario = dao.getById(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não localizou o registro\n" + e, "erro", 0);
        }
        return funcionario;
    }

    public static void save(Funcionario funcionario) throws SQLException, Exception {
        FuncionarioDAO dao = new FuncionarioDAO();
        try {
            validator(funcionario);
            dao.save(funcionario);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro\n" + e, "erro", 0);
        }
    }

    public static void update(Funcionario funcionario) throws SQLException, Exception {
        FuncionarioDAO dao = new FuncionarioDAO();
        try {
            validator(funcionario);
            dao.update(funcionario);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro\n" + e, "erro", 0);
        }
    }

    public static ArrayList<Funcionario> listAll() throws SQLException {
        FuncionarioDAO dao = new FuncionarioDAO();
        ArrayList<Funcionario> minhaLista = null;
        try {
            minhaLista = dao.listAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros\n" + e, "erro", 0);
        }

        return minhaLista;
    }
    
    public static void delete(int id) throws SQLException {
        FuncionarioDAO dao = new FuncionarioDAO();
        try {
            dao.delete(id);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o registro\n" + e, "erro", 0);
        }
    }

    public static void validator(Funcionario funcionario) throws Exception {
        if(funcionario.getNome().isEmpty() || funcionario.getNome()==null){
            JOptionPane.showMessageDialog(null, "");
        }
    }
}
