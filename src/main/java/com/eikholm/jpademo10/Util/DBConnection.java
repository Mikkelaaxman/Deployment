/*


package com.eikholm.jpademo10.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {


*/
/**
     * @author Mikkel Åxman
     * Class for establishing the Database connection using DriverManager
     * @param conn           variable later made as a singleton pattern in the if statement
     * @param url            String used to hold the URL for the Database
     * @param name           String used to hold the Username for the Database
     * @param pass           String used to hold the Password for the Database
     * @return
     *//*

    private static Connection conn;


    public static Connection getDatabaseConnection()
    {

        if (conn != null) return conn;

        String name, pass, url;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://database-1.cbaps6mmxm6e.us-east-1.rds.amazonaws.com";
            name = "admin";
            pass = "uBNRSICqJIovaYNlmugE";
            conn = DriverManager.getConnection(url, name, pass);
            System.out.println("Connection created");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return conn;
    }
}
*/
