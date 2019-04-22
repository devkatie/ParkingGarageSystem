package model;

public class Demo {
	public static void main(String[] args) {

		Ticket ticket = new Ticket("HHE6555", "Katie", "Hourly");
		Receipt receipt = new Receipt(ticket);
		System.out.println(ticket.printOut());
		System.out.println();
		System.out.println(receipt.printOut());
		Vehicle car = new Truck();
		System.out.println(car.getEarlyBirdPrice());
		System.out.println("Completed!");
		// test
	}

}
