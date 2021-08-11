package com.company;

public class Plane extends Vehicle {
	protected int height;
	protected int passengers;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public Plane(int price, int speed, int year, int height, int passengers) {
		super(price, speed, year);
		this.height = height;
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return super.toString()+ "Plane{" +
				"height=" + height +
				", passengers=" + passengers +
				'}';
	}

	@Override
	protected String Move(String coordinates) {
		return super.Move(coordinates)+" by air";
	}

}
