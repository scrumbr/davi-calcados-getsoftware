/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.getsoftware.davicalcados.connection.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 * 
 */
public class GenericSQL {

    private static Connection conexao;
    
    
    public GenericSQL() throws SQLException {
        GenericSQL.conexao = Conexao.getConexao();
    }
    
    private ResultSet genericResultset;
    private Statement genericStatement;

    public ResultSet getGenericResultset() {
        return genericResultset;
    }

    public void setGenericResultset(ResultSet genericResultset) {
        this.genericResultset = genericResultset;
    }

    public Statement getGenericStatement() {
        return genericStatement;
    }

    public void setGenericStatement(Statement genericStatement) {
        this.genericStatement = genericStatement;
    }

    
    public void genericSQL(String sql) throws SQLException {
        try {
            genericStatement = conexao.createStatement();
            genericResultset = genericStatement.executeQuery(sql);

        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando SQL  \n\n" + sqlex
                    + "\n\nO comando SQL foi:\n" + sql);
        } 
    }
}
