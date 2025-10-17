
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author salma
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.map.containsKey(licensePlate)) {
            return false;
        }
        this.map.put(licensePlate, owner);
        return true;

    }

    public String get(LicensePlate licensePlate) {
        return this.map.get(licensePlate);

    }

    public boolean remove(LicensePlate plate) {
        if (!(this.map.containsKey(plate))) {
            return false;
        }
        this.map.remove(plate);
        return true;

    }
    public void printLicensePlates() {
        for (LicensePlate plate:this.map.keySet()){
            System.out.println(plate);
        }
    }
    public void printOwners() {
        ArrayList<String> mentioned = new ArrayList<>(); 
        for (LicensePlate plate:this.map.keySet()) {
            if (!(mentioned.contains(this.map.get(plate)))) {
                System.out.println(this.map.get(plate));
                mentioned.add(this.map.get(plate));
            }
        }
    }
}
