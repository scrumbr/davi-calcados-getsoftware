/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.myinterface;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JUNIOR
 * @param <T>
 */
public interface InterfaceCRUD <T> {
    T getById(Integer id)throws SQLException;
    void save(T obj)throws SQLException;
    void update(T obj)throws SQLException;
    ArrayList<T> listAll()throws SQLException;
    void delete(Integer id)throws SQLException;
}
