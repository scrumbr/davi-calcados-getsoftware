/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.exception;

/**
 *
 * @author Junior Oliveira
 */
public class FormatoSQLException extends Exception{

    public FormatoSQLException() {
        super("comando SQL inválido, não pode ser nulo e nem vazio!");
    }
    
}
