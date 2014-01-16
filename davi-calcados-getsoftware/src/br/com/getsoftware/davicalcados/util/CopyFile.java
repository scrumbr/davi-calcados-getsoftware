/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class CopyFile {

    public static void copyFile(File endereco, File destino) throws IOException {

        if (destino.exists()) {

            destino.delete();
        }

        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;

        try {

            sourceChannel = new FileInputStream(endereco).getChannel();

            destinationChannel = new FileOutputStream(destino).getChannel();

            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao criar uma cópia do arquivo!\n" + e);

        } finally {
            if (sourceChannel != null && sourceChannel.isOpen()) {
                sourceChannel.close();
            }
            if (destinationChannel != null && destinationChannel.isOpen()) {
                destinationChannel.close();
            }
        }
    }
}
