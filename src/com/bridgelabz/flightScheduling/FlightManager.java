package com.bridgelabz.flightScheduling;

import java.util.*;

class FlightManager<T> {
    private List<Flight<T>> flights = new ArrayList<>();

    public void addFlight(Flight<T> flight) {
        flights.add(flight);
    }

    public void displayAllFlights() {
        for (Flight<T> flight : flights) {
            flight.displayFlight();
        }
    }
}
