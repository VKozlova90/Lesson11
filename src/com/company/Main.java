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

        AddressConnector connector = new AddressConnector(connection);

        Address address1 = new Address(1, "Minsk","Brovki", 12, 1,8);
        Address address2 = new Address(2, "Brest","Gumnaya", 4,  0,1);
        Address address3 = new Address(3, "Grodno","Kypala", 2, 2,3);
        Address address4 = new Address(4, "NYork","Skver", 8, 3,9);
        Address address5 = new Address(5, "Minsk","Golub", 1, 1,4);

        connector.add (address1);
        connector.add (address2);
        connector.add (address3);
        connector.add (address4);
        connector.add (address5);

        for (Address a : connector.readAll()){
            System.out.println(a);
        }







    }

    }
