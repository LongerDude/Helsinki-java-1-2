
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;
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
public class Reader {

    private Scanner scanner;
    private ArrayList<String> list;
    private ArrayList<Recipe> recipes;

    public void stringListToObjectList() {
        int beginning = 0;
        while (beginning < this.list.size()) {
            Recipe recipe = new Recipe(this.list.get(beginning));
            int time = Integer.valueOf(this.list.get(beginning + 1));
            recipe.setCookingTime(time);
            beginning += 2;

            for (int i = beginning; i < this.list.size(); i++) {
                if (this.list.get(i).equals("")) {
                    beginning++;
                    break;
                }
                recipe.addIngredients(this.list.get(i));
                beginning++;

            }
            this.recipes.add(recipe);
        }
    }

    public Reader() {
        this.scanner = new Scanner(System.in);
        this.list = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    public void readFile(String filename) {
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {
            while (fileReader.hasNextLine()) {
                this.list.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void list() {
        for (Recipe recipe:this.recipes){
            System.out.println(recipe);
        }
    }
    public void find(String word) {
        for (Recipe recipe:this.recipes) {
            if (recipe.getName().contains(word))
                System.out.println(recipe);
        }
    }

    public void findByCookingTime(int time) {
        for (Recipe recipe:this.recipes) {
            if (recipe.getCookingTime()<= time){
                System.out.println(recipe);
            }
        }
    }
    public void findByIngredient(String ingredient) {
        for (Recipe recipe:this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
