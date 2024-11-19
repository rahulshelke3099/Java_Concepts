package org.java.basics;

import java.sql.Connection;
import java.sql.DriverManager;

public enum MyEnum {
    INSTANCE;

    private Connection connection;

    // Constructor
    private MyEnum() {
        try {
            System.out.println("In private Constructor of Enum ");
            // Initialize the database connection
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "username";
            String password = "password";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        }  catch (Throwable e) {
           System.out.println("Error in Connection");
        }
    }

    // Method to get the database connection instance
    public Connection getConnection() {
        return connection;
    }
}
