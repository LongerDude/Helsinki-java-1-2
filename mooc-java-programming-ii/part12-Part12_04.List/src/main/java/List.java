/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class List<T> {
    private T[] values;
    private int firstIndex;
    public List(){
        this.values = (T[]) new Object[10];
    }
    public void add(T value){
        if (firstIndex == values.length){
            this.grow();
        }
        this.values[this.firstIndex] = value;
        this.firstIndex++;
    }
    public void grow(){
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++){
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }
    
}
