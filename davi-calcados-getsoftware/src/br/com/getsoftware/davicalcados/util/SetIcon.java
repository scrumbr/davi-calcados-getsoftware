/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Junior Oliveira
 */
public class SetIcon {
    public static void setIcon(JFrame frame, String iconMaisExtensao){
        Image imageIcone = Toolkit.getDefaultToolkit().getImage("src/br/com/getsoftware/davicalcados/icons/"+iconMaisExtensao);
        frame.setIconImage(imageIcone);
    }
}
