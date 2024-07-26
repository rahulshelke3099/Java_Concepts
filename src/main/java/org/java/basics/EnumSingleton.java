package org.java.basics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EnumSingleton {
    public static void main(String[] args) {
        Connection connection = MyEnum.INSTANCE.getConnection();

        try {
            // Example query
            String sql = "SELECT now()";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                // Process each row
                String username = resultSet.getString("username");
                System.out.println("Username: " + username);
            }

            // Close resources
            resultSet.close();
            statement.close();
        } catch (Throwable e) {
            System.out.println("Caught in Exception");
        }
    }
}
