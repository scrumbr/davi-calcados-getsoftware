/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

import br.com.getsoftware.davicalcados.bo.GenericSQLBO;
import java.sql.SQLException;

/**
 *
 * @author Junior Oliveira
 */
public class LastID {
    public static Integer atualizaId(String atributo, String tabela) throws SQLException{
        GenericSQLBO.genericQuery("select "+atributo+" from "+tabela+" order by "+atributo+" desc limit 1");
        if (GenericSQLBO.genericResultSet().last() == false) {
            return 1;
        } else {
            return (GenericSQLBO.genericResultSet().getInt(atributo) + 1);
        }
    }
    
     public static Long lastId(String atributo, String tabela) throws SQLException{
        GenericSQLBO.genericQuery("select "+atributo+" from "+tabela+" order by "+atributo+" desc limit 1");
        if (GenericSQLBO.genericResultSet().last() == false) {
            return Long.valueOf(1);
        } else {
            return (GenericSQLBO.genericResultSet().getLong(atributo));
        }
    }
}
