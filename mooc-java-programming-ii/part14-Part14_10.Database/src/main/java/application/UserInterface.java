package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            switch (command) {
                case "1":
                    System.out.println("Listing the database contents");
                    System.out.println(database.list());
                    break;
                case "2":
                    System.out.println("Enter name");
                    String name = scanner.nextLine();
                    System.out.println("Enter description");
                    String description = scanner.nextLine();
                    Todo todo = new Todo(database.list().size() + 1, name, description, false);
                    database.add(todo);
                    break;
                case "3":
                    System.out.println("Which todo should be marked as done (give the id)?");
                    int id = Integer.valueOf(scanner.nextLine());
                    database.markAsDone(id);
                    break;
                case "4":
                    System.out.println("Which todo should be removed (give the id)?");
                    int idToRemove = Integer.valueOf(scanner.nextLine());
                    database.remove(idToRemove);
                    break;
            }

            // implement the functionality here
        }

        System.out.println("Thank you!");
    }

}
