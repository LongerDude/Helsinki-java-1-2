/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class Organism implements Movable {
    private int xposition;
    private int yposition;
    public Organism(int x, int y){
        this.xposition = x;
        this.yposition = y;
    }
    @Override
    public String toString(){
        return "x: " + this.xposition + ";" + " y: "+ this.yposition;
    }
    @Override
    public void move(int dx, int dy){
        this.xposition += dx;
        this.yposition += dy;
        
    }
    
}
