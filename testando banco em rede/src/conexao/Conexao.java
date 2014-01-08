/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JUNIOR
 */
public class Conexao {
    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado ao banco...");
            return DriverManager.getConnection("jdbc:mysql://localhost/teste_rede", "root", "");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
            throw new SQLException(e.getMessage());

        }
    }
}
