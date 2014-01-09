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
public class TransformCnpj {
    public static String transformCnpj(String cnpj) {
        // 12.321.321/0001-01
        if (cnpj.contains(".") && cnpj.contains("/") && cnpj.contains("-")) {
            cnpj = cnpj.replace(".", "");
            cnpj = cnpj.replace("/", "");
            cnpj = cnpj.replace("-", "");
            return cnpj;
        } else {
            String cnpj2 = cnpj.substring(0, 2)+".";
            cnpj2 += cnpj.substring(2, 5)+".";
            cnpj2 += cnpj.substring(5, 8)+"/";
            cnpj2 += cnpj.substring(8, 12)+"-";
            cnpj2 += cnpj.substring(12, 14);
            return cnpj2;
        }
    }
}
