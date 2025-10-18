/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        
        super(productName,capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
        
        
    }
    public String history(){
        return this.history.toString();
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return taken;
    }
    public void printAnalysis(){
        System.out.println("Product: " + this.getName() + "\n" +"History: " + this.history() + "\n" + "Largest amount of product: " + this.history.maxValue() + "\n" + "Smallest amount of product: " + this.history.minValue()+ "\n"+ "Average: "+ this.history.average());
    }
    
}
