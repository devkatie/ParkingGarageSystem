package model;

public class Receipt extends Printable {

	public Receipt(Ticket ticket) {
		this.setAttendantName(ticket.getAttendantName());
		this.setLicensePlate(ticket.getLicensePlate());
		this.setPaymentScheme(ticket.getPaymentScheme());
		this.setTime(ticket.getTime());

	}

	@Override
	public String printOut() {
		return "---YOUR RECEIPT---\n" + "PLATE #: " + getLicensePlate() + EOL_STRING + "ATTENDANT: "
				+ getAttendantName() + EOL_STRING + "TIME PARKED: " + getTime() + EOL_STRING + "PAYMENT TYPE: "
				+ getPaymentScheme() + EOL_STRING + "THANK YOU! PARK AGAIN SOON";
	}

}
