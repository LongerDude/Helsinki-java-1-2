/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class Container {
    private int maxVolume;
    private int volume;
    
    public Container () {
        this.maxVolume = 100;
        this.volume = 0;
    }
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (amount >= this.maxVolume) {
            this.volume = 100;
            return;
        }
        if (amount + this.volume > this.maxVolume) {
            this.volume = 100;
        } else {
            this.volume += amount; 
        }
        
    }
    public void remove (int amount) {
        if (this.volume == 0 || amount < 0) {
            return;
        }
        if (this.volume - amount < 0) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
        
        
    }
    @Override
    public String toString() {
        return this.volume +"/100";
    }
    public int contains() {
        return this.volume;
    }
}
