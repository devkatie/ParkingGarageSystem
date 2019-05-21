package com.example.myapplication;


public class Ticket extends Printable {

    public Ticket(String licensePlate, double paymentScheme) {
        this.setLicensePlate(licensePlate);
        this.setPaymentScheme(paymentScheme);
    }

    @Override
    public String printOut() {
//		private String licensePlate;
//		private ParkingSpot spotType;
//		private String attendantName;
//		private String time;
//		private String paymentScheme;
        return "---YOUR TICKET---\n" + "PLATE #: " + getLicensePlate()
                + EOL_STRING + "PAYMENT TYPE: " + getPaymentScheme();
    }

}