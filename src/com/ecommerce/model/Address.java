package com.ecommerce.model;

public class Address {
    private  String houseNo;
    private String streetName;
    private String area;
    private String city;
    private int pincode;

    public String getHouseNo() {
        return houseNo;
    }

    public Address() {
    }

    public Address setHouseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getArea() {
        return area;
    }

    public Address setArea(String area) {
        this.area = area;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public int getPincode() {
        return pincode;
    }

    public Address setPincode(int pincode) {
        this.pincode = pincode;
        return this;
    }


}
