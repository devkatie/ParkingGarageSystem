package com.example.myapplication;

import java.util.Random;
import java.util.TreeMap;

public class Manager {

    private TreeMap attendantTree;
    final String[] NAMES = {"John", "Mark", "Sarah", "Maria", "Kevin", "Theresa"};

    public Manager() {
        attendantTree = new TreeMap();
    }

    public Attendant createAttendant() {
        Random random = new Random(6);
        int name = random.nextInt();
        Attendant attendant = new Attendant(NAMES[name].toString());
        attendantTree.put(NAMES[name], attendant);
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
