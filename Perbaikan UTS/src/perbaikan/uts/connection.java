/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbaikan.uts;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author LENOVO
 */
public class connection {
    Connection con;
    Statement st;

public void config() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/user","root","");
        st = (Statement) con.createStatement();
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Koneksi Gagal masuk ke Database!!!\n" + e.getMessage());
    }
  
}
