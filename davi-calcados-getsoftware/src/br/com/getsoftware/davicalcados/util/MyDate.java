/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIBD.gerenciadorDeAcademia.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author JUNIOR
 */
public class MyDate {

    private static Date data = new Date();

    public static String getDia() {
        String dia = "0";
        if(data.getDate()>9){
            dia = "";
        }
        String diaAtual = dia+data.getDate();
         
        return diaAtual;

    }

    public static String getDiaSemana() {
        String dia = null;
        if (data.getDay() == 0) {
            dia = "Domingo";
        } else if (data.getDay() == 1) {
            dia = "Segunda-Feira";
        } else if (data.getDay() == 2) {
            dia = "Terça-Feira";
        } else if (data.getDay() == 3) {
            dia = "Quarta-Feira";
        } else if (data.getDay() == 4) {
            dia = "Quinta-Feira";
        } else if (data.getDay() == 5) {
            dia = "Sexta-Feira";
        } else if (data.getDay() == 6) {
            dia = "Sabado";
        }
        return dia;
    }

    public static String getMes() {
        String mes = null;
        if (data.getMonth() == 0) {
            mes = "Janeiro";
        } else if (data.getMonth() == 1) {
            mes = "Fevereiro";
        } else if (data.getMonth() == 2) {
            mes = "Março";
        } else if (data.getMonth() == 3) {
            mes = "Abril";
        } else if (data.getMonth() == 4) {
            mes = "Maio";
        } else if (data.getMonth() == 5) {
            mes = "Junho";
        } else if (data.getMonth() == 6) {
            mes = "Julho";
        } else if (data.getMonth() == 7) {
            mes = "Agosto";
        } else if (data.getMonth() == 8) {
            mes = "Setembro";
        } else if (data.getMonth() == 9) {
            mes = "Outubro";
        } else if (data.getMonth() == 10) {
            mes = "Novembro";
        } else if (data.getMonth() == 11) {
            mes = "Dezembro";
        }
        return mes;
    }

    public static int getAno() {
        return data.getYear() + 1900;
    }

    public static String getDataAtual() {
        return " " + getDiaSemana() + ", " + getDia() + " de " + getMes() + " de " + getAno();
    }

    public static String dataFormatada() {
        
        return getDia() + "/" + data.getMonth() + "/" + getAno();
    }

    public static void main(String[]args){
        System.out.println(dataFormatada());
    }
}
