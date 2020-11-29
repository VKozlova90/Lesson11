package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressConnector {

    private Connection connection;
    private static final String ADD = "INSERT INTO addresses (id, city, street, number_house, house_building, apartment)";
    private  static final String REQUEST = "SELECT * FROM addresses";

    public AddressConnector(Connection connection) {
        this.connection = connection;
    }

    public void add(Address address) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, address.getId());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getStreet());
            statement.setInt(4, address.getNumber_house());
            statement.setInt(5, address.getHouse_building());
            statement.setInt(6, address.getApartment());

            int res = statement.executeUpdate();
            System.out.println(res);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }

   public List <Address> readAll(){
       List <Address> res = new ArrayList<>();

       try (PreparedStatement statement = connection.prepareStatement(REQUEST)) {

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt("id");
                String city = result.getString("city");
                String street = result.getString("street");
                int number_house = result.getInt("number_house");
                int house_building = result.getInt("house_building");
                int apartment = result.getInt("apartment");

                Address a = new Address(id, city, street, number_house, house_building, apartment);

                res.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
       return res;
   }

    public void delete(int id) {


        try (PreparedStatement statement = connection.prepareStatement("Удалить стоку, если id=?")) {

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update (Address address) {
        int res = 0;

        try {
            PreparedStatement statement = connection.prepareStatement("update Address set "
                    //+ "title=?, body=?, category_id=?");

            statement.setInt(1, address.getId());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getStreet());
            statement.setInt(4, address.getNumber_house());
            statement.setInt(5, address.getHouse_building());
            statement.setInt(6, address.getApartment());

            res = pr.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }









}
