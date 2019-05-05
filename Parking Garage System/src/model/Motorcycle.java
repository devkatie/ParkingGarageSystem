package model;

public class Motorcycle implements Vehicle {

	private String licensePlate;

	public Motorcycle(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	@Override
	public double getHourlyPrice() {
		return 1.00;
	}

	@Override
	public double getEarlyBirdPrice() {
		return 10.00;
	}

}
