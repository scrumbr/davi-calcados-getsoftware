/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.getsoftware.davicalcados.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wilton
 */
public class CriaBanco {

    public static void criaBancoETabelas() {
        try {
            String commands[] =  {"cmd.exe"," /c" ," mysql  -uroot -p123456"," /c", "create database aaaaaaaaaaaaa;"," /c"};

            Runtime.getRuntime().exec(commands);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        criaBancoETabelas();
    }
}
