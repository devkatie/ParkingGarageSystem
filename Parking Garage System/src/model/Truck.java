package model;

public class Truck implements Vehicle {

	@Override
	public double getHourlyPrice() {
		return 5.00;
	}

	@Override
	public double getEarlyBirdPrice() {
		return 40.00;
	}

}
