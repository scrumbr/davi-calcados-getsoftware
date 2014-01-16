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
public class FormatCNPJInvalidException extends Exception{

    public FormatCNPJInvalidException() {
        super("CNPJ com tamanho ou formato inválido!");
    }
    
}
