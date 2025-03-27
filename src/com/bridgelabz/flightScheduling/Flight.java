package com.bridgelabz.flightScheduling;

public class Flight<T> {
    private T flightNumber;
    private String destination;
    private String departureTime;

    public Flight(T flightNumber, String destination, String departureTime){
        this.flightNumber =flightNumber;
        this.destination =destination;
        this.departureTime =departureTime;
    }
    public T getFlightNumber(){
        return flightNumber;
    }
    public void displayFlight(){
        System.out.println("Flight Number: "+ flightNumber+ " -> Destination: "+ destination+ " -> Departure Time: " + departureTime);
    }
}