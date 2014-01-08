/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo;

import conexao.Conexao;
import dao.PessoaDAO;
import entity.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class PessoaBO {
    
    public static void save(Pessoa pessoa) throws SQLException, Exception {
        validator(pessoa);
        PessoaDAO.save(pessoa);
    }

    public static void update(Pessoa pessoa) throws SQLException, Exception {
         validator(pessoa);
         PessoaDAO.update(pessoa);
    }

    public static ArrayList<Pessoa> listAll() throws SQLException {
        return PessoaDAO.listAll(); 
    }

    public static void delete(Integer id) throws SQLException {
         PessoaDAO.delete(id);
    }
     
     public static void validator(Pessoa pessoa) throws Exception {
        if (pessoa.getNome().isEmpty() || pessoa.getNome().equals(null)) {
            throw new Exception("Nome não pode ser nulo!");
        }
        if (pessoa.getTelefone().isEmpty() || pessoa.getTelefone().equals(null)) {
            throw new Exception("Telefone não pode ser nulo");
        }
        if (pessoa.getId() < 0) {
            throw new Exception("Código não pode ser menor que zero!");
        }

    }
}
