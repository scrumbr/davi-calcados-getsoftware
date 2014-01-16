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
    public static Integer atualizaId(String atributo, String tabela) throws SQLException {
        GenericSQLBO.genericQuery("select max("+atributo+") as lastid from "+tabela);
//        GenericSQLBO.genericResultSet().last();
        if (GenericSQLBO.genericResultSet().last() == false) {
            return 1;
        } else {
            return (GenericSQLBO.genericResultSet().getInt("lastid") + 1);
        }
    }
}
