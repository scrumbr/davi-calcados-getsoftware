/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.myabstract;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author wilton
 */
public class TestandoParcelamento {

    public static void main(String[] args) {
        
        
        System.out.println(NumberFormat.getInstance().format(45665.45));
        
        
        
//
//        GregorianCalendar gc = new GregorianCalendar();
//        float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor total"));
//        int numPar = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de parcelas"));
//       
//        Date diaAtual = new Date();
//        float valApx = valor / numPar;
//        NumberFormat nf = NumberFormat.getInstance();
//        nf.setMaximumFractionDigits(2);
//        
//        for (int e = 0; e < numPar; e++) {
//             
//            gc.setTime(diaAtual);
//            gc.roll(GregorianCalendar.MONTH, e);
//            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//            Date d = gc.getTime();
//            
//            if (d.equals(diaAtual)) {
//                System.out.print("Entrada: ");
//            } else {
//                System.out.print("Parcela " + e + ": ");
//            }
//            System.out.println(df.format(d) + ": " + nf.format(valApx));
//         }
    }
}
