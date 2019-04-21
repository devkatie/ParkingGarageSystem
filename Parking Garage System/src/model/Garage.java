package model;

import java.util.HashMap;
import java.util.Map;

public class Garage {
	/*
	 * a structure containing ParkingSpot objects, which are ordered so Vehicle
	 * objects can park into the correct sized ParkingSpot. There can only be one
	 * Garage object, which the User is not allowed to generate. The one and only
	 * garage will be initialized when the user creates an account, and the Garage
	 * object and all of the objects associated with it will be saved once the user
	 * logs out/closes the application.
	 */
	private int cars;
	private int motorcycles;
	private int trucks;
	private int total;
	private Map<Integer, ParkingSpot> garageMap;

	public Garage(int cars, int motorcycles, int trucks) {
		this.cars = cars;
		this.motorcycles = motorcycles;
		this.trucks = trucks;
		this.total = cars + motorcycles + trucks;
		garageMap = new HashMap<Integer, ParkingSpot>(total);
	}

	public Garage() {
		this.cars = 60;
		this.motorcycles = 20;
		this.trucks = 20;
		this.total = 100;
		garageMap = new HashMap<Integer, ParkingSpot>(total); 
	}

}
