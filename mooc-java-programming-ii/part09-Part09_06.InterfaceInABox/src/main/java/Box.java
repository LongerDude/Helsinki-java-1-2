
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
public class Box implements Packable{

    private ArrayList<Packable> box;
    private double capacity;

    public Box(double capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
    }
    

    @Override
    public double weight() {
        double currentWeight = 0;
        for (Packable item : this.box) {
            currentWeight += item.weight();
        }
        return currentWeight;

    }

    public void add(Packable packable) {

        if (packable.weight() + this.weight() > capacity) {
            return;
        }

        this.box.add(packable);
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }

}
