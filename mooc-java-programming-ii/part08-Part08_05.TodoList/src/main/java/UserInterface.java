
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author salma
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add:");
                String task = this.scanner.nextLine();
                this.list.add(task);

            }
            if (command.equals("list")) {
                this.list.print();
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                this.list.remove(index);

            }
        }
    }
}
