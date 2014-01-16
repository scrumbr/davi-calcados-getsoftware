/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

/**
 *
 * @author Junior Oliveira
 */
public class TransformTelefone {
    public static String transformTelefone(String telefone){
       
        if(telefone.contains("(") && telefone.contains(")") && telefone.contains("-")){
            telefone = telefone.replace("(", "").replace(")", "").replace("-", "");
        }else{
            String telefone2 = "";
            telefone2 += "("+telefone.substring(0,2)+")";
            telefone2 += telefone.substring(2,6)+"-";
            telefone2 += telefone.substring(6,10)+"";
            telefone = telefone2;
        }//(88)1234-4567
        return telefone;
    }
}
