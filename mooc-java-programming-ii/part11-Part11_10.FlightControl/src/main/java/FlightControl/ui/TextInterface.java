/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author salma
 */
public class TextInterface implements UserInterface {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        FlightControl control = new FlightControl();

        while (true) {
            System.out.println("Airport Asset Control");
            System.out.println("--------------------");
            System.out.println();

            System.out.println("Choose an action: ");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                while (true) {
                    System.out.println("Flight Control");
                    System.out.println("------------");
                    System.out.println();
                    System.out.println("Choose an action:");
                    System.out.println("[1] Print airplanes");
                    System.out.println("[2] Print flights");
                    System.out.println("[3] Print airplane details");
                    System.out.println("[x] Quit");
                    String input2 = scanner.nextLine();
                    if (input2.equals("x")) {
                        break;
                    }
                    if (input2.equals("1")) {
                        control.printPLanes();
                    }
                    if (input2.equals("2")) {
                        control.printFlights();

                    }
                    if (input2.equals("3")) {
                        System.out.println("Give the airplane id:");
                        String id = scanner.nextLine();
                        control.printPlane(id);

                    }
                }
                break;
            }
            if (input.equals("1")) {
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.println("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                control.addAirPlane(id, capacity);

            }
            if (input.equals("2")) {
                System.out.println("Give the airplane id: ");
                String plane = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String start = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String end = scanner.nextLine();
                control.addFlight(plane, start, end);

            }

        }
    }

}
