package model;

import java.util.TreeMap;

public class Manager {

	private TreeMap attendantTree = new TreeMap();

	public Attendant createAttendant(String name) {
		Attendant attendant = new Attendant(name);
		attendantTree.put(name, attendant);
		return attendant;
	}

	public void deleteAttendant(String name) {
		attendantTree.remove(name);
		System.out.println("Attendant " + name + " removed successfully!");
	}

	public boolean hasAttendant(String name) {
		return attendantTree.containsKey(name);
	}
}
