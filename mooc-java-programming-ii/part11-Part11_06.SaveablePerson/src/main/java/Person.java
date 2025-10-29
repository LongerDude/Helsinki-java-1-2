/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class Person implements Saveable {
    private String name;
    private String address;

    public void test(){
        
    }
    @Override
    public void save() {
        System.out.println("saves");

    }

    @Override
    public void delete() {

    }

    @Override
    public void load(String address) {

    }

}
