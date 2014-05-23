/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

import br.com.getsoftware.davicalcados.connection.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author wilton
 */
public class ExecutaSQLs {
    private ResultSet resultset;
    private Statement statement;
    private Connection conexao;
    
    public ExecutaSQLs() throws SQLException{
        conexao = Conexao.getConexao();
    }
       public void executeSQL(String sql) {

        try {
            statement = conexao.createStatement();
            resultset = statement.executeQuery(sql);

        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando SQL  " + sqlex
                    + "\nO comando SQL foi:" + sql);

        }
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
       
}
