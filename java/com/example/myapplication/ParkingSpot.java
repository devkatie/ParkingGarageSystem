package com.example.myapplication;

import java.util.HashSet;
import java.util.LinkedList;

public class ParkingSpot {

    private HashSet<ParkingSpot> vehicles = new HashSet<>(30);
    private Vehicle vehicle;
    private Ticket ticket;

    public boolean hasVehicle() {
        return vehicle != null;
    }

    public void park(Vehicle vehicle) {
        this.setVehicle(vehicle);
        ticket = new Ticket(vehicle.getLicensePlate(), vehicle.getHourlyPrice());

        //System.out.println(vehicle.getLicensePlate() + " Parked Successfully!");
    }

    public void unpark() {

       // System.out.println(vehicle.getLicensePlate() + " Unparked Successfully!");
        setVehicle(null);
    }

    public String spotDetails() {
        if(this.hasVehicle()) {
            return "License Plate: " + vehicle.getLicensePlate() + "\nPayment: " + vehicle.getHourlyPrice();
        } else {
            return "No Vehicle Parked.";
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
