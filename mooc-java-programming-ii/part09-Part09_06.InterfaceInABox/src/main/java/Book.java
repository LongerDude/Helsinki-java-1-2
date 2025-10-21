/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class Book implements Packable {

    private String name;
    private double weight;
    private String author;

    public Book(String author, String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.author = author;
    }

    @Override
    public double weight() {
        return this.weight;

    }
    @Override
    public String toString(){
        return this.author + ": " + this.name;
    }

}
