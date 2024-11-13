/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Signup {

    private static final String URL = "jdbc:mysql://localhost:3306/signup";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }

    public static void insertUser (int receptionistID, String username, String email, String password) {
      
        String sql = "INSERT INTO users (ReceptionistID, Username, Email, Password) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            
            pstmt.setInt(1, receptionistID); 
            pstmt.setString(2, username);
            pstmt.setString(3, email);
            pstmt.setString(4, password);

            
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}