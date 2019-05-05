package model;

public class Demo {
	public static void main(String[] args) {

		// Ticket Testing
		Ticket ticket = new Ticket("HHE6555", "Katie", "Hourly");
		Receipt receipt = new Receipt(ticket);
		System.out.println(ticket.printOut());
		System.out.println();
		System.out.println(receipt.printOut());

		// Manager/Attendant Testing
		Manager manager = new Manager();
		Attendant attendant = manager.createAttendant("Susan");
		System.out.println(attendant.getName());

		// Vehicle Testing
		Vehicle car = new Truck("PLATE1");
		System.out.println(car.getLicensePlate() + ": " + car.getEarlyBirdPrice());
		Car car2 = new Car("PLATE2");
		System.out.println(car2.getLicensePlate() + ": " + car.getEarlyBirdPrice());

		// ParkingSpot Testing
		ParkingSpot spot1 = new ParkingSpot();
		spot1.park(car2);
		System.out.println(spot1.getVehicle().getLicensePlate());
		System.out.println(spot1.hasVehicle());
		spot1.unpark();
		System.out.println(spot1.hasVehicle());

		// Completed
		System.out.println("Completed!");
	}

}
