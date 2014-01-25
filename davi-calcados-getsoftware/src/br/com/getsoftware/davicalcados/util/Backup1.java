/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class Backup1 {

    // Objeto da classe JFileChooser
    JFileChooser fl;
    // Instancia a classe Conecta, criando o objeto con
     
    public Backup1(String user, String senha, String dbName) {

        try {
            // Conecta com o banco de dados
             
            // Cria uma pasta chamada Configuração do Banco, e dentro cria uma arquivo txt chamado Configuração
            BufferedReader ler = new BufferedReader(new FileReader("Configuração do Banco/Configuração.txt"));
            // String que recebe a linha lida no arquivo txt
            String caminho = ler.readLine();
            // Instancia a classe JFileChooser
            fl = new JFileChooser();
            String arquivo;
            // Seta um título para o objeto JFileChooser
            fl.setDialogTitle("Salvar como");
            // Variável do tipo int recebe o retorno da escolha do usuário
            int resultado = fl.showSaveDialog(null);
            // Verifica se o resultado foi aprovado
            if (resultado == JFileChooser.APPROVE_OPTION) {
                // String recebe o nome do arquivo e concatena com extensão .sql
                arquivo = fl.getSelectedFile().toString().concat(".sql");
                // Cria o arquivo
                File file = new File(arquivo);
                // Verifica se o arquivo já existe
                if (file.exists()) {
                    // Pergunta se deseja substituir o arquivo existente
                    int escolha = JOptionPane.showOptionDialog(null, "Arquivo existente, deseja substituílo ?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sim", "Não"}, "Sim");
                    // Se a escolha for sim
                    if (escolha == JOptionPane.YES_OPTION) {
                        // Cria o objeto da classe ProcessBuilder, passando para seu construtor os dados para realizar o backup
                        ProcessBuilder pb = new ProcessBuilder(caminho, "--user="+user, "--password=" + senha + "", dbName, "--result-file=" + arquivo);
                        // Executa o backup
                        pb.start();
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Backup não realizado !");
                    }
                } // Se não existir, ele cria direto
                else {
                    ProcessBuilder pb = new ProcessBuilder(caminho, "--user="+user, "--password=" + senha + "", dbName, "--result-file=" + arquivo);
                    pb.start();
                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso !");
                }
            } else {
            }

        } catch (IOException | HeadlessException e) {
            e.printStackTrace();

        }
    }
}
