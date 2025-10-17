
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> map;
    public StorageFacility() {
        this.map = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.map.putIfAbsent(unit, new ArrayList<>());
        this.map.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.map.containsKey(storageUnit)) {
            return this.map.get(storageUnit);
        }
        ArrayList <String> emptyList = new ArrayList<>();
        return emptyList;

    }
    public void remove(String key, String item) {
        for (String keyy:this.map.keySet()) {
            if (this.map.get(keyy).contains(item)){
               
                this.map.get(keyy).remove(this.map.get(keyy).indexOf(item));
            }
            
        }
        
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String key : this.map.keySet()) {
            if (!(this.map.get(key).isEmpty())) {
                list.add(key);                
            }
        }
        return list;
    }

}
