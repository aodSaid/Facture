package com.saidou;

public class Customer {
    String fullname;
    String address;

    public Customer(String fullname, String address) {
        this.address= address;
        this.fullname= fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
