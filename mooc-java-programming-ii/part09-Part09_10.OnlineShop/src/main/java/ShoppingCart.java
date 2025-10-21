
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    public ShoppingCart() {
        this.cart = new HashMap<>();
        }
    public void add(String product, int price){
        if (this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
            return;
        }
        this.cart.put(product, new Item(product, 1, price));
    }
    public void print(){
        for (String product:this.cart.keySet()){
            System.out.println(this.cart.get(product).toString());
        }
    }
    public int price(){
        int sum = 0;
        for (Item product:this.cart.values()){
            sum += product.price();
        }
        return sum;
    }
    
}
