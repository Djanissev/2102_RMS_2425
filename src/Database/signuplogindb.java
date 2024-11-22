/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.*;

public class signuplogindb {
    
    static final String DB_URL = "jdbc:mysql://localhost/signup";
    static final String USER = "root";
    static final String PASSWORD = "";
    public static Connection connectDB() {
        Connection conn = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors found while connecting to database");
            return null;
        }
    }
}
