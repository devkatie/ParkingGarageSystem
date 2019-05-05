package model;

public class Car implements Vehicle {

	private String licensePlate;

	public Car(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	@Override
	public double getHourlyPrice() {
		return 2.50;
	}

	@Override
	public double getEarlyBirdPrice() {
		return 20.00;
	}

}
