/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import br.com.getsoftware.davicalcados.connection.Conexao;
import java.io.File;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class BackUP {
    // Botão Backup
 
    public static void backUp(String user, String dbName) {
        JFileChooser JFC_Salvar_Backup = new JFileChooser();
        try {
            String arquivo = null;

            JFC_Salvar_Backup.setVisible(true);

            int result = JFC_Salvar_Backup.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                arquivo = JFC_Salvar_Backup.getSelectedFile().toString().concat(".sql");

                File file = new File(arquivo);

                if (file.exists()) {
                    Object[] options = {"Sim", "Não"};
                    int opcao = JOptionPane.showOptionDialog(null, "Este arquivo já existe. Quer sobreescrever este arquivo?", "Atenção!!!",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    if (opcao == JOptionPane.YES_OPTION) {
                        Runtime bck = Runtime.getRuntime();
                        bck.exec("mysqldump.exe "+user+"  "+dbName+" >  --result-file=" + arquivo);
                        System.out.println(arquivo);
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Backup", 1);
                    } else {
                        backUp(user, dbName);
                    }
                } else {

                    Runtime bck = Runtime.getRuntime();
                     bck.exec("mysqldump.exe "+user+"  "+dbName+" >  " + arquivo);
                     System.out.println(arquivo);
                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "backup", 1);
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }

    }
}
