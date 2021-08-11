package com.company;

public class Vehicle {
	protected int price;
	protected int speed;
	protected int year;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	protected String Move(String coordinates) {
		return " Moving to " + coordinates;
	}

	public Vehicle(int price, int speed, int year) {
		this.price = price;
		this.speed = speed;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Vehicle{" +
				"price=" + price +
				", speed=" + speed +
				", year=" + year +
				'}'+Move("Odessa");
	}
}
