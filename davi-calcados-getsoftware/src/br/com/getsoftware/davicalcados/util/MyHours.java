/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TIBD.gerenciadorDeAcademia.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author JUNIOR
 */
public class MyHours {
     private static String hora;
    
    private static SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");

    public static String getHoraAtual() {
        Date horaAtual = new Date();
        hora = horaFormatada.format(horaAtual);
        return hora;
    }

}
