/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

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
 
     public static String getMesNumero(){
        String mes = null;
         if(data.getMonth()== 0){
             mes = "01";
         }else if(data.getMonth()== 1){
             mes = "02";
         }else if(data.getMonth()== 2){
             mes = "03";
         }else if(data.getMonth()== 3){
             mes = "04";
         }else if(data.getMonth()==4){
             mes = "05";
         }else if(data.getMonth()== 5){
             mes = "06";
         }else if(data.getMonth()== 6){
             mes = "07";
         }else if(data.getMonth()== 7){
             mes = "08";
         }else if(data.getMonth()== 8){
             mes = "09";
         }else if(data.getMonth()== 9){
             mes = "10";
         }else if(data.getMonth()== 10){
             mes = "11";
         }else if(data.getMonth()== 11){
             mes = "12";
         }
         return mes;
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

    public static String getMesDetalhe() {
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
        return " " + getDiaSemana() + ", " + getDia() + " de " + getMesDetalhe()+ " de " + getAno();
    }

    public static String dataFormatada() {        
        return getDia() + "/" + getMesNumero()+ "/" + getAno();
    }
}
