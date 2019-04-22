package model;

public class Motorcycle implements Vehicle {

	@Override
	public double getHourlyPrice() {
		return 1.00;
	}

	@Override
	public double getEarlyBirdPrice() {
		return 10.00;
	}

}
