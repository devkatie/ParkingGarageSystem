package model;

public class Car implements Vehicle {

	@Override
	public double getHourlyPrice() {
		return 2.50;
	}

	@Override
	public double getEarlyBirdPrice() {
		return 20.00;
	}

}
