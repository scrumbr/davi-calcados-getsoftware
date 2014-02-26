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
public class TransformMoeda {

    public static String trasnformMoeda(String valor) {
        String newValue; // variável de suporte 1
        String newFormat; // variável de suporte 2
        
        if(!valor.isEmpty()){
        // se o valor entrar formatado
        if (valor.contains("R$ ")) {
            // newValue removerá a formatação do R$
            newValue = valor.replace("R$ ", "");
            // e newFormat receberá os valores de newValue 
            //trocando vírgula por pontos
            newFormat = newValue.replace(',', '.');
            //retorna o valor de newFormat
            return newFormat;
        } else {

            //se o valor não possuir fomatação
            //o valor receberá a formatação no seu início
            newValue = ("R$ " + valor);
            //newValue agora tem o formato R$ 
            //se possuir ponto ou vírgula
            //é feita a troca e retorna o valor com suas casas decimais formatadas
            if (newValue.contains(".") || newValue.contains(",")) {
                //toca o ponto por vírgula
                newFormat = newValue.replace('.', ',');
                return newFormat;
            } else {
                //se não tiver ponto ou vírgula
                //o valor receberá casas decimais no seu final
                newValue = newValue + ",00";
                return newValue;
            }
        }
        }else{
            return "R$ 0,00";
        }
    }
}
