/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wilton
 */
public class Test {

    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = formatador.format(data);
        System.out.println(minhaData);
    }
}
