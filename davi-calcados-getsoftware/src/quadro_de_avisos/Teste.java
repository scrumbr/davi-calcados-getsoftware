/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadro_de_avisos;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Oliveira
 */
public class Teste {
       
    public void test2(){
         try
        {            
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec("calc");
            InputStream stdin = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            System.out.println("<OUTPUT>");
            JOptionPane.showMessageDialog(null, "jnfgjnfjnfgjnfgg");
            while ( (line = br.readLine()) != null)
                System.out.println(line);
            System.out.println("</OUTPUT>");
            int exitVal = proc.waitFor();            
            System.out.println("Process exitValue: " + exitVal);
        } catch (Throwable t)
          {
            t.printStackTrace();
          }
    }
    
    public boolean test() {  
    boolean t = false;
        try {  
            Process processo = Runtime.getRuntime().exec("notepad");  
            InputStream ips = processo.getInputStream();  
              
            int c = 0;  
            System.out.println(ips.read());
            while ((c = ips.read()) != -1) {
                System.out.println(ips.read());
                System.out.print((char)c);  
            }  
            System.out.println(ips.read());
              t = true;
        } catch (Exception e) {
            t = false;
        } 
        return t;
    }  
      
    public static void main(String[] args) { 
        new Teste().test2();
//        if(new Teste().test()){
//            System.out.println("só o filé");
//        }else{
//            System.out.println("nao deu");
//        }
          
    }  
} 

