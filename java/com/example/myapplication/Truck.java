package com.example.myapplication;

public class Truck implements Vehicle {

    private String licensePlate;

    public Truck(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public double getHourlyPrice() {
        return 5.00;
    }

    @Override
    public double getEarlyBirdPrice() {
        return 40.00;
    }

}

