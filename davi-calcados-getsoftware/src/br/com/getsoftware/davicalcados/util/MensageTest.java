/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class MensageTest {
    public static void main(String[]args){
//        JOptionPane.showConfirmDialog(null, "Deseja efetuar um novo cadastro ?", "novo registro", JOptionPane.YES_NO_OPTION);
        
        JOptionPane.showMessageDialog(null, "1", "", 0);//Errro - X
        JOptionPane.showMessageDialog(null, "2", "", 1);//OK - !
        JOptionPane.showMessageDialog(null, "3", "", 2);//Warn - /!\
        JOptionPane.showMessageDialog(null, "4", "", 3);//pergunta - ?
    }
}
