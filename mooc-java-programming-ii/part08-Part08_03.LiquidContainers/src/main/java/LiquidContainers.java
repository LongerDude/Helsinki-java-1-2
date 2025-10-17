
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int number = Integer.valueOf(parts[1]);

            if (command.equals("add") && number > 0) {
                if (firstContainer != 100) {
                    if (firstContainer + number > 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += number;
                    }
                }
            }
            if (command.equals("move") && number > 0) {
                if (secondContainer != 100) {
                    if (secondContainer + number > 100) {
                        secondContainer = 100;
                        if (firstContainer - number < 0) {
                            firstContainer = 0;
                        } else {
                            firstContainer -= number;
                        }

                    } else {
                        if (number > firstContainer) {
                            secondContainer += firstContainer;
                        } else {
                            secondContainer += number;
                        }

                        if (firstContainer - number < 0) {
                            firstContainer = 0;
                        } else {
                            firstContainer -= number;
                        }
                    }
                } else {
                    if (firstContainer - number < 0) {
                        firstContainer = 0;
                    } else {
                        firstContainer -= number;
                    }
                }
            }
            if (command.equals("remove") && number > 0) {
                if (secondContainer != 0) {
                    if (secondContainer - number >= 0) {
                        secondContainer -= number;
                    } else {
                        secondContainer = 0;
                    }
                }

            }

            System.out.println("");
        }

    }

}

