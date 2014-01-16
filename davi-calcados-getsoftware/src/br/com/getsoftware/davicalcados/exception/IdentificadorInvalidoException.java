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
public class IdentificadorInvalidoException extends Exception{

    public IdentificadorInvalidoException() {
        super("Identificador não pode ser menor ou igual a '0' (zero)!");
    }
        
    
}
