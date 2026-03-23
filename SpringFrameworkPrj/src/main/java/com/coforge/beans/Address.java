package com.coforge.beans;

public class Address {

    private String hno;
    private String street;
    private String city;
    private String state;
    private String pincode;

    public Address(String hno, String street, String city, String state, String pincode) {
        this.hno = hno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Address() {}

    @Override
    public String toString() {
        return "Address [hno=" + hno + ", street=" + street +
               ", city=" + city + ", state=" + state +
               ", pincode=" + pincode + "]";
    }
}
