
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
public class Recipe {
    private String name;
    private Integer cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name) {
        this.name = name;
        this.cookingTime = 0;        
        this.ingredients = new ArrayList<>();
    }
    public void setCookingTime(Integer time){
        this.cookingTime = time;
    }
    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }
    public String getName(){
        return this.name;
    }
    public Integer getCookingTime(){
        return this.cookingTime;
    }
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    @Override
    public String toString(){
        return this.getName()+", cooking time: " + this.cookingTime;
        
    }
    
}
