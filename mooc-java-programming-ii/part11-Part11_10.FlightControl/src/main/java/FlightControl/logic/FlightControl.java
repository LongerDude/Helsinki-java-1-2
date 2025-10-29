/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Flight;
import FlightControl.domain.Plane;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author salma
 */
public class FlightControl {

    private HashMap<String, Plane> planes;
    private HashMap<String, Place> places;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        planes = new HashMap<>();
        places = new HashMap<>();
        flights = new HashMap<>();
    }

    public void addAirPlane(String ID, int capacity) {
        Plane plane = new Plane(ID, capacity);
        this.planes.put(ID, plane);
    }

    public void addFlight(String plane, String start, String end) {
        places.putIfAbsent(start, new Place(start));
        places.putIfAbsent(end, new Place(end));
        Flight flight = new Flight(this.planes.get(plane), this.places.get(start), this.places.get(end));
        this.flights.put(flight.toString(), flight);

    }

    public Collection<Plane> getPlanes() {
        return this.planes.values();
    }
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    public void printPLanes(){
        this.planes
                .values()
                .stream()
                .forEach(s -> System.out.println(s));
    }
    public void printFlights(){
        this.flights
                .values()
                .stream()
                .forEach(s -> System.out.println(s));
    }
    public void printPlane(String id){
        System.out.println(this.planes.get(id));
    }
    
}
