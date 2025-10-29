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
public class Plane {
    private final String ID;
    private final int capacity;
    
    public Plane(String id, int capacity){
        this.ID = id;
        this.capacity = capacity;
    }

    public String getID() {
        return ID;
    }

    public int getCapacity() {
        return capacity;
    }
    
    @Override
    public String toString(){
        return this.ID + " (" + this.capacity + " capacity)";
    }
}
