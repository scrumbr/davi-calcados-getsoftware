/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

/**
 *
 * @author JUNIOR
 */
public class TransformDate {

    public static String transformDate(String data) {
        System.out.println(data);
        if(data.contains("/")){
           String tranform[] = data.split("/");
        String newData = ""+tranform[2] + "/" + tranform[1] + "/" + tranform[0]+""; 
        return newData;
        }
        else if(data.contains("-")){
           String tranform[] = data.split("-");
        String newData = ""+tranform[2] + "/" + tranform[1] + "/" + tranform[0]+""; 
        return newData;
        }
        else{
            return null;
        }
    }

}
