package com.example.myapplication;

public class Receipt extends Printable {

    public Receipt(Ticket ticket) {
        this.setLicensePlate(ticket.getLicensePlate());
        this.setPaymentScheme(ticket.getPaymentScheme());

    }

    @Override
    public String printOut() {
        return "---YOUR RECEIPT---\n" + "PLATE #: " + getLicensePlate() + EOL_STRING + "PAYMENT TYPE: "
                + getPaymentScheme() + EOL_STRING + "THANK YOU! PARK AGAIN SOON";
    }

}

