/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksidb;

import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDB {
    static Connection conn;
    
    public static Connection getConnection() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/pv_biodata";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return conn;
    }
        
}