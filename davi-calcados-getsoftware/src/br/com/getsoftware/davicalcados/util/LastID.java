/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import br.com.getsoftware.davicalcados.bo.GenericSQLBO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class LastID {

    /**
     * RETORNA O VALOR PARA O PRÓXIMO DADOA A SER INSERIDO EM UMA DADA TABELA
     *
     * @param atributo
     * @param tabela
     *
     * @return @throws java.sql.SQLException
     */
    public static Integer proximoId(String atributo, String tabela) throws SQLException {
        try {
            GenericSQLBO.genericQuery("select " + atributo + " from " + tabela + " order by " + atributo + " desc limit 1");
            if (GenericSQLBO.genericResultSet().last() == false) {
                return 1;
            } else {
                return (GenericSQLBO.genericResultSet().getInt(atributo) + 1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível retornar o próximo id a ser gerado!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * RETORNA A ULTIMA POSIÇÃO DE UMA DADA TABELA
     *
     * @param atributo
     * @param tabela
     * @return
     */
    public static Long ultimoId(String atributo, String tabela) {
        try {
            GenericSQLBO.genericQuery("select " + atributo + " from " + tabela + " order by " + atributo + " desc limit 1");
            if (GenericSQLBO.genericResultSet().last() == false) {
                return Long.valueOf(1);
            } else {
                return (GenericSQLBO.genericResultSet().getLong(atributo));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível retornar o último id!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
