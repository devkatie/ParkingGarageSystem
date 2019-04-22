package model;

public class ParkingSpot {

	private Vehicle vehicle;

	public void park(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void unpark() {
		vehicle = null;
	}
}
