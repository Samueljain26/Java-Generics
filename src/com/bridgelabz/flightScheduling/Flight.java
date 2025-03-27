package com.bridgelabz.flightScheduling;

public class Flight<T> {
    private T flightNumber;
    private String departure;
    private String destination;

    public Flight(T flightNumber, String departure, String destination){
        this.flightNumber =flightNumber;
        this.destination =destination;
        this.departure =departure;
    }
    public T getFlightNumber(){
        return flightNumber;
    }
    public void displayFlight(){
        System.out.println("Flight Number: "+ flightNumber+ " -> From: "+ departure+ " -> TO: " + destination);
    }
}