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

    private Connection conexao;

    public BackUP(JFileChooser JFC_Salvar_Backup) {
        try {
            this.conexao = Conexao.getConexao();//Conecta ao banco de dados 
            JFC_Salvar_Backup.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }
    }

    public void backUp(JFileChooser JFC_Salvar_Backup) {
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
                        bck.exec("src/br/com/getsoftware/davicalcados/util/mysqldump.exe -v -v -v --host=localhost --user=root --password= --port=3306 --protocol=tcp --force --allow-keywords --compress  --add-drop-table --default-character-set=latin1 --hex-blob  --result-file=" + arquivo + " --databases Projeto Atlas");
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Backup", 1);
                    } else {
                        backUp(JFC_Salvar_Backup);

                    }
                } else {

                    Runtime bck = Runtime.getRuntime();
                    bck.exec("TIBD/gerenciadorDeAcademia/util/mysqldump.exe -v -v -v --host=localhost --user=root --password= --port=3306 --protocol=tcp --force --allow-keywords --compress  --add-drop-table --default-character-set=latin1 --hex-blob  --result-file=" + arquivo + " --databases Projeto Atlas");
                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Tudo OK!", 1);
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }

    }
}
