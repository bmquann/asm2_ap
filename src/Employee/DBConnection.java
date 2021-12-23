/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author manhq
 */
public class DBConnection {
    private static DBConnection getuni;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (getuni == null) {
            getuni = new DBConnection();
        }
        return getuni;
    }
    public static Connection getConnect() {
        String path = "jdbc:mysql://localhost:3306/ap";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(path, "root", "");
        } catch (Exception ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static void main(String[] args) {
        DBConnection db=new DBConnection();
        System.out.println(getConnect());
    }
}
