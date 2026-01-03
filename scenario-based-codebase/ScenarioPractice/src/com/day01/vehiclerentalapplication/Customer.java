package com.day01.vehiclerentalapplication;

class Customer {

    private String name;
    private String contactNumber;

    public Customer(String name, String contactNumber) {

        this.name = name;
        this.contactNumber = contactNumber;
    }

    public void displayInfo() {

        System.out.println("Customer: " + name +
                ", Contact: " + contactNumber);
    }
}
