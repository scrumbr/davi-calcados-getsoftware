/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TIBD.gerenciadorDeAcademia.util;

/**
 *
 * @author JUNIOR
 */
public class TransformCpf {
    public static String transformCpf(String cpf) {
        if (cpf.contains(".") && cpf.contains("-")) {
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            return cpf;
        } else {
            String cpf2 = cpf.substring(0, 3)+".";
            cpf2 += cpf.substring(3, 6)+".";
            cpf2 += cpf.substring(6, 9)+"-";
            cpf2 += cpf.substring(9, 11);
            return cpf2;
        }
    }
}
