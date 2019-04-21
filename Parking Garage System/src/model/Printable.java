package model;

public abstract class Printable {
	/*
	 * The driver will be issued a ticket during the parking time. The ticket should
	 * contain the license plate number, the category designated by the attendant,
	 * the name of the attendant, the parking date and time, and the payment scheme
	 * applied. The driver will also be issued a receipt during the retrieval time.
	 * The receipt should contain the license plate number, the category designated
	 * by the attendant, the name of the attendant, the parking and retrieval date
	 * and time, the payment scheme applied, and the amount charged and paid.
	 */

	private String licensePlate;
	private String spotType;
	private String attendantName;
	private String time;
	private String paymentScheme;

	public static final String EOL_STRING = System.getProperty("line.separator");
	public static final String SPACE = " ";

	public abstract String printOut();

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getSpotType() {
		return spotType;
	}

	public void setSpotType(String spotType) {
		this.spotType = spotType;
	}

	public String getAttendantName() {
		return attendantName;
	}

	public void setAttendantName(String attendantName) {
		this.attendantName = attendantName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPaymentScheme() {
		return paymentScheme;
	}

	public void setPaymentScheme(String paymentScheme) {
		this.paymentScheme = paymentScheme;
	}

}
