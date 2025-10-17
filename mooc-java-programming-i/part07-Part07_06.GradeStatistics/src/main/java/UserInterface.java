
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
    private Grades grades;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.grades = new Grades();
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(this.scanner.nextLine());
            if (input == -1) {
                System.out.println("Point average (all): " + grades.average());
                if (grades.averagePassing() == 0) {
                    System.out.println("Point average (passing): -");
                } else {
                    System.out.println("Point average (passing): " + grades.averagePassing());
                }
                System.out.println("Pass percentage: " + grades.passPercentage());
                grades.distribution();

                break;
            }
            this.grades.add(input);

        }
    }
    

}
