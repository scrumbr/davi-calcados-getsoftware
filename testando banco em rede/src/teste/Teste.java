/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import dao.PessoaDAO;
import entity.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class Teste {
    public static void main(String[]args){
        
        Pessoa pessoa = new Pessoa();
        pessoa.setId(7);
        pessoa.setNome("teste update");
        pessoa.setTelefone("(11)1234-8888");
        try {
            PessoaDAO.delete(7);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar o arquivo!","ERRO",0);
        }
    }
}
