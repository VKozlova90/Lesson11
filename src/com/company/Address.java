package com.company;

public class Address {

    public int id;
    public String city;
    public String street;
    public int number_house;
    public int house_building;
    public int apartment;

    public Address(int id, String city, String street, int number_house, int house_building, int apartment) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.number_house = number_house;
        this.house_building = house_building;
        this.apartment = apartment;
    }

}
