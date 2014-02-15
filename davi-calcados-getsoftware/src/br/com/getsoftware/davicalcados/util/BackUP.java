/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class BackUP {
    // Botão Backup

    public static void backUp(String user, String senha, String dbName) {
        try {
            String arquivo = null;
            JFileChooser JFC_Salvar_Backup = new JFileChooser();
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
//                        Runtime bck = Runtime.getRuntime();
//                        bck.exec("mysqldump.exe -v -v -v --host=localhost --user="+user+" --password="+senha+" --port=3306 --protocol=tcp --force --allow-keywords --compress  --add-drop-table --default-character-set=latin1 --hex-blob  --result-file=" + arquivo + " --databases"+dbName);
//                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "if", 1);
                        ProcessBuilder pb = new ProcessBuilder("mysqldump.exe", "--user=" + user, "--password=" + senha + "", dbName, "--result-file=" + arquivo);
                        // Executa o backup
                        pb.start();
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso !");

                    } else {
                        JOptionPane.showMessageDialog(null, "Backup não realizado!", "Atenção", 2);

                    }

                } else {
                    try{
                    ProcessBuilder pb = new ProcessBuilder("mysqldump.exe", "--user=" + user, "--password=" + senha + "", dbName, "--result-file=" + arquivo);
                    // Executa o backup
                    pb.start();
                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso!", "Backup", 1);
                    }catch(Exception e ){
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar o backup!", "Erro", 0);
                        e.printStackTrace();
                    }
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }

    }
}
