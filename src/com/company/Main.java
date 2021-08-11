package com.company;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(10000, 20, 2000);
		System.out.println(vehicle);

		Plane plane = new Plane(10000,20,2000,10000,52);
		System.out.println(plane);

		Ship ship = new Ship(1000, 1000, 1000, 1000,52,12,"Kiev");
		System.out.println(ship);
	}
}
