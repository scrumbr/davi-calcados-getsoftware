    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    package br.com.getsoftware.davicalcados.util;

    import java.text.SimpleDateFormat;
    import java.util.Date;
    import javax.swing.JOptionPane;

    /**
     *
     * @author Andrey Gois
     */
    public class ValidatorDate {


        public static void validatorDate(String campo){
            SimpleDateFormat aux = new SimpleDateFormat("dd/MM/yyyy");
    try{
        Date data = aux.parse(campo);
    }catch (Exception e){ //n lembro a exceção q dispara qdo formata errado
    JOptionPane.showMessageDialog(null, "Data inválida!");}
        }



    }
