package com.goldilocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseReader {
    public static void main(String[] args) {
        Connection con = null;
        String url = "jdbc:mysql://localhost/test";
        String user = "root";
        String pass = "root";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String query = "SELECT employeeName, employeeAge FROM test";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            int counter = 1;
            System.out.println("Employee Name" + "\t\t" + "Employee Age");
            while (result.next()) {
                String empName = result.getString("employeeName");
                String empAge = result.getString("employeeAge");
                System.out.println(empName + "\t\t\t" + empAge);
                counter++;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
