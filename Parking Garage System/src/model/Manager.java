package model;

public class Manager {

	public Attendant createAttendant(String name) {
		return new Attendant(name);
	}
}
