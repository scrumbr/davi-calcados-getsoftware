/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TIBD.gerenciadorDeAcademia.util;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Junior Oliveira
 */
public class SaveImageForPath {
    public static void saveForPath(JFrame frame, String caminhoDestino, JLabel recebeIcone){
        try {

            JFileChooser buscaFoto = new JFileChooser();
            buscaFoto.setCurrentDirectory(new File("Bibliotecas/Documentos/Imagens"));
            buscaFoto.setFileSelectionMode(JFileChooser.FILES_ONLY);
            buscaFoto.setDialogTitle("Carregar imagem");
            buscaFoto.showOpenDialog(frame);

            String extensao = "";
            
            if(buscaFoto.getSelectedFile().getName().endsWith(".jpg")){
                extensao = ".jpg";
            }else if(buscaFoto.getSelectedFile().getName().endsWith(".png")){
                extensao = ".png";
            }else if(buscaFoto.getSelectedFile().getName().endsWith(".bmp")){
                extensao = ".bmp";
            }else if(buscaFoto.getSelectedFile().getName().endsWith(".gif")){
                extensao = "gif";
            }else{
                JOptionPane.showMessageDialog(null, "Formato inválido");
                return;
            }
            
            String foto = "" + buscaFoto.getSelectedFile().getPath();

            System.out.println("endereço da imagem escolhida\n"+foto);

            File caminho = new File(foto);
            File destino = new File(caminhoDestino+extensao);

            CopyFile.copyFile(caminho, destino);
                         
            String bg = "" + destino.getAbsolutePath();

            System.out.println("\nendereço da nova imagem no destino\n "+bg);

            ImageIcon imagem = new ImageIcon(bg);
 
            Image redimensionadora = imagem.getImage().getScaledInstance(recebeIcone.getSize().width, recebeIcone.getSize().height, Image.SCALE_DEFAULT);

            imagem = new ImageIcon(redimensionadora);
             
            recebeIcone.setBounds(0, 0, recebeIcone.getHorizontalAlignment(), recebeIcone.getVerticalAlignment());
            
            recebeIcone.setIcon(imagem);
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Nenhuma imagem foi carregada!\n"+erro);
        }
    }
}
