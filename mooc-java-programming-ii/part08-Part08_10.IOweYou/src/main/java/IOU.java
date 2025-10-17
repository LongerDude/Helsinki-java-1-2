
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
public class IOU {
    private HashMap<String,Double> map;
    public IOU(){
        this.map = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        this.map.put(toWhom, amount);
        this.map.put(toWhom, this.map.getOrDefault(toWhom, 0.0));
    }
    public double howMuchDoIOweTo(String toWhom) {
        return map.getOrDefault(toWhom, 0.0);
        
    }
    
}
