package model;

public class ParkingSpot {

	private Vehicle vehicle;

	public void park(Vehicle vehicle) {
		this.setVehicle(vehicle);
	}

	public void unpark() {
		setVehicle(null);
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
