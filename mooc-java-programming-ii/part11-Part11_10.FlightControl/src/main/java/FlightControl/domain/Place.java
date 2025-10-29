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
public class Place {
    final private String place;
    public Place(String place){
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
    @Override
    public String toString(){
        return this.place;
    }
}
