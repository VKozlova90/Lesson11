package com.company;

public class Address {

    private int id;
    private String city;
    private String street;
    private int number_house;
    private int house_building;
    private int apartment;

    public Address(int id, String city, String street, int number_house, int house_building, int apartment) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.number_house = number_house;
        this.house_building = house_building;
        this.apartment = apartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber_house() {
        return number_house;
    }

    public void setNumber_house(int number_house) {
        this.number_house = number_house;
    }

    public int getHouse_building() {
        return house_building;
    }

    public void setHouse_building(int house_building) {
        this.house_building = house_building;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number_house=" + number_house +
                ", house_building=" + house_building +
                ", apartment=" + apartment +
                '}';
    }


}
