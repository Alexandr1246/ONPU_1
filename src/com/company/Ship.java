package com.company;

public class Ship extends Plane{
    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public String getPortRegistration() {
        return portRegistration;
    }

    public void setPortRegistration(String portRegistration) {
        this.portRegistration = portRegistration;
    }

    private int numberPassengers;
    private String portRegistration;

    @Override
    public String toString() {
        return "Ship{" +
                "numberPassengers=" + numberPassengers +
                ", portRegistration='" + portRegistration + '\'' +
                '}';
    }

    public Ship (int price, int speed, int year, int height, int passengers, int numberPassengers, String portRegistration){
        super (price, speed, year, height, passengers);
        this.numberPassengers = numberPassengers;
        this.portRegistration = portRegistration;
    }
    protected String Move(String coordinates) {
        return super.Move(coordinates)+" by air";
    }

}
