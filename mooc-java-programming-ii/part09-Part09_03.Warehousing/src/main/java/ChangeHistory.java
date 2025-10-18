
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
public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    @Override
    public String toString() {
        return this.list.toString();
    }

    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0.0;
        }
        double max = this.list.get(0);
        for (double cap : this.list) {
            if (cap > max) {
                max = cap;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.list.isEmpty()) {
            return 0.0;
        }
        double min = this.list.get(0);
        for (double cap : this.list) {
            if (cap < min) {
                min =  cap;
            }
        }
        return min;

    }
    public double average(){
        double sum = 0;
        double count = 0;
        for (double value: this.list){
            sum += value;
            count++;
        }
        return sum/count;
    }
}
