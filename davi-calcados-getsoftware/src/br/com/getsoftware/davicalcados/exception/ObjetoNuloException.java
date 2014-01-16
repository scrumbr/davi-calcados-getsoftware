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
public class ObjetoNuloException extends Exception{

    public ObjetoNuloException(Object obj) {
        super("O objeto '"+obj.getClass()+"' não pode ser nulo!");
    }
    
}
