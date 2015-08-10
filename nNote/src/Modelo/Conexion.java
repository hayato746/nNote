/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Conexion {

    Connection conexion = null;
    Statement consulta;
    public String ruta;

    //private static String OS = System.getProperty("os.name").toLowerCase();
    /**
     * Constructor for objects of class Conexion
     */
    public Conexion() {

        ruta = "E:/BD/nNota.s3db";

        /*if (isWindows()) {
         //ruta = ".\\BD\\nNota.s3db";
         ruta = "E:\\BD\\nNota.s3db";
         } else if (isSolaris() || isMac() || isUnix()) {
         ruta = "./BD/nNote.s3db";
         } else {
         JOptionPane.showMessageDialog(null, "Tu OS no es soportado por la aplicación",
         "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
         }*/
    }

    /*public static boolean isWindows() {
    
     return (OS.indexOf("win") >= 0);
    
     }
    
     public static boolean isMac() {
    
     return (OS.indexOf("mac") >= 0);
    
     }
    
     public static boolean isUnix() {
    
     return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
    
     }
    
     public static boolean isSolaris() {
    
     return (OS.indexOf("sunos") >= 0);
    
     }*/
    public void conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:" + ruta);
            consulta = conexion.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } /*finally {
        try {
        if (conexion != null) {
        conexion.close();
        }
        } catch (SQLException e) {
        // connection close failed.
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }*/
    }

    /*public void cerrarCon(){
     try {
     conexion.close();
     } catch (SQLException e) {
     Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
     }
     }*/
}
