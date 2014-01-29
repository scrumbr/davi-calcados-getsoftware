/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.getsoftware.davicalcados.util;

/**
 *
 * @author Junior Oliveira
 */
public class BackupAndRestore {
    public boolean backupDB(String dbName, String dbUserName, String dbPassword, String path) {
 
        String executeCmd = "mysqldump -u " + dbUserName +  " --add-drop-database -B " + dbName + " -r " + path;
        Process runtimeProcess;
        try {
 
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();
 
            if (processComplete == 0) {
                System.out.println("Backup created successfully");
                return true;
            } else {
                System.out.println("Could not create the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
        return false;
    }
    
    public static boolean restoreDB(String dbName, String dbUserName, String dbPassword, String source) {
 
        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName,"-e", "source "+source};
 
        Process runtimeProcess;
        try {
 
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();
 
            if (processComplete == 0) {
                System.out.println("Backup restored successfully");
                return true;
            } else {
                System.out.println("Could not restore the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
        return false;
    }
//    
//    public boolean restoreDB(String dbUserName, String dbPassword, String source) {
// 
//        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source "+source};
// 
//        Process runtimeProcess;
//        try {
// 
//            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
//            int processComplete = runtimeProcess.waitFor();
// 
//            if (processComplete == 0) {
//                System.out.println("Backup restored successfully");
//                return true;
//            } else {
//                System.out.println("Could not restore the backup");
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
// 
//        return false;
//    }
//    
    
}
