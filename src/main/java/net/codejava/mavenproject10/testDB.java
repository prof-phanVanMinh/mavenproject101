/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.mavenproject10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class testDB {
     public static final String URL = "jdbc:mysql://localhost:3306/commerce";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "admin";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(testDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public static void main(String[] args) {
        Connection conn = getConnection();
        if(conn!=null)
            System.out.println("Ket noi thanh cong");
        else{
            System.out.println("Ket noi that bai");
        }
    }
}
