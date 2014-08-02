/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import java.text.NumberFormat;

/**
 *
 * @author wilton
 */
public class TransformadorNumerico {

    public static String tranformadorNumerico(Object obj) {
        return NumberFormat.getInstance().format(obj);
    }
}
