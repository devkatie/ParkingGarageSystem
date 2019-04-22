package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ticket extends Printable {

	public Ticket(String licensePlate, String attendantName, String paymentScheme) {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		String timeOriginated = formatter.format(LocalDateTime.now());
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
