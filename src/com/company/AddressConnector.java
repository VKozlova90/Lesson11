package com.company;

import javax.sql.ConnectionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressConnector {

    private Connection connection;
    private static final String ADD = "INSERT INTO addresses (id, city, street, number_house, house_building, apartment)";

    public AddressConnector(Connection connection) {
        this.connection = connection;
    }

    public void add(Address address) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setString(1, address.getId());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getStreet());
            statement.setString(4, address.getNumber_house());
            statement.setString(5, address.getHouse_building());
            statement.setString(6, address.getApartment());

            int res = statement.executeUpdate();
            System.out.println(res);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
