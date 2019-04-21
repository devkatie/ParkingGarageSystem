package model;

import java.util.Date;

public class Ticket extends Printable {

	public Ticket(String licensePlate, String attendantName, String paymentScheme) {
		Date date = new Date();
		String timeOriginated = "" + date.getTime();
		this.setTime(timeOriginated);
		this.setLicensePlate(licensePlate);
		this.setAttendantName(attendantName);
		this.setPaymentScheme(paymentScheme);
	}

	@Override
	public String printOut() {
//		private String licensePlate;
//		private ParkingSpot spotType;
//		private String attendantName;
//		private String time;
//		private String paymentScheme;
		return "---YOUR TICKET---\n" + "PLATE #: " + getLicensePlate() + EOL_STRING + "ATTENDANT: " + getAttendantName()
				+ EOL_STRING + "TIME PARKED: " + getTime() + EOL_STRING + "PAYMENT TYPE: " + getPaymentScheme();
	}

}
