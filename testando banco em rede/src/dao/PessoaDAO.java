/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.Conexao;

import entity.Pessoa;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class PessoaDAO {
  
    public static void save(Pessoa pessoa) throws SQLException {
        Connection conexao = Conexao.getConexao();
        
        String sql = "insert into pessoa(nome, telefone) "
                + " values (?, ?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, pessoa.getNome());
        stmt.setString(2, pessoa.getTelefone());

        stmt.execute();
        stmt.close();
    }

    public static void update(Pessoa pessoa) throws SQLException {
        
        Connection conexao = Conexao.getConexao();
        
        String sql = "update  pessoa set nome=?, telefone=? where id=? order by nome";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, pessoa.getNome());
        stmt.setString(2, pessoa.getTelefone());
        stmt.setLong(3, pessoa.getId());

        stmt.execute();
        stmt.close();
    }

    public static ArrayList<Pessoa> listAll() throws SQLException {
        Connection conexao = Conexao.getConexao();
        
        String sql = "select * from pessoa";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        ArrayList<Pessoa> minhaLista = new ArrayList<>();
        while (res.next()) {
            Pessoa pessoa = new Pessoa();

            pessoa.setId(Integer.valueOf(res.getString("id")));
            pessoa.setNome(res.getString("nome"));
            pessoa.setTelefone(res.getString("telefone"));

            minhaLista.add(pessoa);
        }
        res.close();
        stmt.close();
        return minhaLista;
    }

    public static void delete(Integer id) throws SQLException {
        Connection conexao = Conexao.getConexao();
        
        String sql = "delete from pessoa where id=?";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setLong(1, id);

        stmt.execute();
        stmt.close();
    }
    
    public static ResultSet genericResultset;
    public static Statement genericStatement;

    public static void genericSQL(String sql) throws SQLException {
        try {
            Connection conexao = Conexao.getConexao();
            
            genericStatement = conexao.createStatement();
            genericResultset = genericStatement.executeQuery(sql);

        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando SQL  \n\n" + sqlex
                    + "\n\nO comando SQL foi:\n" + sql);
        } 
    }
}
