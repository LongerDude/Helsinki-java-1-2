
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author salma
 */
public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.products = new HashMap<>();
        this.productsStock = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {

        this.products.put(product, price);
        this.productsStock.put(product, stock);

    }

    public int stock(String product) {
        if (this.productsStock.containsKey(product)) {
            return this.productsStock.get(product);
        } else {
            return 0;
        }

    }
    public boolean take(String product){
        if (this.productsStock.containsKey(product)){
            if (this.productsStock.get(product)>0){
                this.productsStock.put(product,this.productsStock.get(product) - 1);
                return true;
            }
        }
        return false;
    }

    public int price(String product) {
        if (this.products.containsKey(product)) {
            return this.products.get(product);
        } else {
            return -99;
        }
    }
    public Set<String> products(){
        Set<String> set = this.products.keySet();
        return set;
    }

}
