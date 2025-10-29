/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author salma
 */
public class Flight {
    private Plane plane;
    private Place startOfFlight;
    private Place endOfFlight;
    
    public Flight(Plane plane, Place start, Place end){
        this.plane = plane;
        this.startOfFlight = start;
        this.endOfFlight = end;
    }

    public Plane getPlane() {
        return plane;
    }

    public Place getStartOfFlight() {
        return startOfFlight;
    }

    public Place getEndOfFlight() {
        return endOfFlight;
    }
    @Override 
    public String toString(){
        return this.plane.toString() + " (" + this.startOfFlight + "-" + this.endOfFlight + ")";
    }
    
}
