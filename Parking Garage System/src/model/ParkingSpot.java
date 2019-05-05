package model;

public class ParkingSpot {

	private Vehicle vehicle;

	public boolean hasVehicle() {
		return vehicle != null;
	}

	public void park(Vehicle vehicle) {
		this.setVehicle(vehicle);
		System.out.println(vehicle.getLicensePlate() + " Parked Successfully!");
	}

	public void unpark() {
		System.out.println(vehicle.getLicensePlate() + " Unparked Successfully!");
		setVehicle(null);
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
