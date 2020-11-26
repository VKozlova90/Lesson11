package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private  static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/lesson11?useUnicode=true&serverTimezone=UTC";
    private  static final String USER = "root";
    private  static final String PASS = "Core2duo166";

    public static void main(String[] args) throws SQLException {

        Connection connection  = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Address address = new Address(1, "Minsk","Brovki", 12, 1,8);
        AddressConnector connector = new AddressConnector(connection);
        connector.add (address);

    }

    }
