/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wilton
 */
public class DataAtual {
    public static String dataAtual(){
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = formatador.format(data);
        return minhaData;
    }
    
     public static String dataAtual(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = formatador.format(data);
        return minhaData;
    }
}
