/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import br.com.getsoftware.davicalcados.connection.Conexao;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNIOR
 */
public class RestaurarBackUP {

    public static void restaurarBackUp(String user, String senha, String dbName) throws IOException, InterruptedException {
        // TODO add your handling code here:

        JFileChooser telaRestore = new JFileChooser();
        telaRestore.setCurrentDirectory(new File("Bibliotecas/Imagens"));
        telaRestore.setFileSelectionMode(JFileChooser.FILES_ONLY);
        telaRestore.setDialogTitle("Restaurar backup");
        int result = telaRestore.showOpenDialog(null);

        if (result == JFileChooser.OPEN_DIALOG) {

            String arquivo = "" + telaRestore.getSelectedFile().getPath();
            System.out.println(arquivo);
                
            String executeCmd = "mysql --user=" + user + " --password=" + senha + "-h localhost " + dbName + " <  " + arquivo;
 
            String  cmd =   "mysql.exe -u " + user + " -p " + senha + " -d" + dbName + " < " + arquivo;
 
            ProcessBuilder pb = new ProcessBuilder("mysql.exe", "--user=" , user, "--password=", senha , dbName, "--result-file=" , arquivo);
            // Executa o backup
            
            pb.start();
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso !");

        }
    }
}
