/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.bo;

import br.com.getsoftware.davicalcados.exception.FormatoSQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import br.com.getsoftware.davicalcados.util.GenericSQL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior Oliveira
 */
public class GenericSQLBO {

    private static ResultSet resultSet;
    private static Statement statement;

    public static void genericQuery(String sql) throws SQLException{
        GenericSQL generic = new GenericSQL();
        try {
            validator(sql);
            generic.genericSQL(sql);
        resultSet = generic.getGenericResultset();
        statement = generic.getGenericStatement();
        } catch (FormatoSQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

    public static ResultSet genericResultSet() {
        return resultSet;
    }

    public static Statement genericStatement() {
        return statement;
    }

    public static void validator(String sql) throws FormatoSQLException {
        if (sql.isEmpty() || sql == null) {
            throw new FormatoSQLException();
        }

    }
}
