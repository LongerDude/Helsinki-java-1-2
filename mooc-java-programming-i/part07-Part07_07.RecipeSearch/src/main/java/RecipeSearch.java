
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader fileReader = new Reader();
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        fileReader.readFile(fileName);
        fileReader.stringListToObjectList();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println("Enter command: ");
            
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            }
            if (command.equals("list")){
                
                System.out.println("Recipes: ");
                fileReader.list();
                System.out.println("");
            }
            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                fileReader.find(word);
            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                fileReader.findByCookingTime(time);
            }
            if (command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                fileReader.findByIngredient(ingredient);
            }

        }

    }

}
