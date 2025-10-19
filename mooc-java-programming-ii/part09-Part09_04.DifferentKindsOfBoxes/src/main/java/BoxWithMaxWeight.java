
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> box;
    
    
    public BoxWithMaxWeight(int capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
       
    }
    @Override 
    
    public void add(Item item){
        
        int weight = 0;
        for (Item items: this.box){
            weight += items.getWeight();
        }
        if (weight + item.getWeight()>capacity){
            return;
        }
        this.box.add(item);

        
    }
    @Override
    
    public boolean isInBox(Item item){
        return this.box.contains(item);
    }
    
}
