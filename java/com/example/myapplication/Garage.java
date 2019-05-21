package com.example.myapplication;

public class Garage {
    private ParkingSpot[] cars;
    private ParkingSpot[] trucks;
    private ParkingSpot[] motorcycles;

    public Garage() {
        this.cars = new ParkingSpot[14];
        this.trucks = new ParkingSpot[6];
        this.motorcycles = new ParkingSpot[4];
    }

}
