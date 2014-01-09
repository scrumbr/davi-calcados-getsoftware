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
public class RestaurarBackUP {

    private Connection con; //variável para usar em conexão de banco de dados.
    private Process proc;

    public RestaurarBackUP(JFileChooser JFC_Backup) {

        try {
            con = Conexao.getConexao();//Conecta ao banco de dados 
            JFC_Backup.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }
    }

    public void restaurarBackUp(JFileChooser JFC_Backup) {
        // TODO add your handling code here:
        try {
            JFC_Backup.setVisible(true);
            String bd = "test";
            int result = JFC_Backup.showOpenDialog(null);

            if (result == JFileChooser.OPEN_DIALOG) {

                File bkp;
                bkp = JFC_Backup.getSelectedFile();
                String arq = bkp.getPath();
                System.out.println("bd " + bd);
                System.out.println("arq " + arq);

                String[] cmd = new String[3];
                cmd[0] = "cmd.exe";
                cmd[1] = "/C";
                cmd[2] = "C:/Users/JUNIOR/Documents/NetBeansProjects/ProjetoAtlas/src/Utilitarios/mysql -u root -p -h localhost " + bd + " < " + arq;

                //C:/Users/JUNIOR/Documents/NetBeansProjects/ProjetoAtlas/src/Utilitarios
                Runtime rt = Runtime.getRuntime();
                System.out.println("Executando " + cmd[0] + " " + cmd[1]);
                proc = rt.exec(cmd);

                // any error message?
                StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR");

                // any output?
                StreamGobbler outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT");

                // kick them off
                errorGobbler.run();
                outputGobbler.run();

                // any error???
                int exitVal = proc.waitFor();

                if (exitVal == 0) {
                    JOptionPane.showMessageDialog(null, "Backup Restaurado com sucesso !");
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao restaurar backup. \n Verifique as configurações ou entre em contato com o suporte !");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!\n" + e, 2);
        }
    }
}
