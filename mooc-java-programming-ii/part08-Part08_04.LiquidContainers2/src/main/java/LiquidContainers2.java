
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer );
            System.out.println("Second: " + secondContainer );

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            // userinput
            String[] parts = input.split(" "); // split input to two elements in an array
            String command = parts[0]; // the command
            int number = Integer.valueOf(parts[1]); // the amount or number

            //
            if (command.equals("add")) {
                firstContainer.add(number);
            }
            if (command.equals("move")) {
                if (firstContainer.contains() == 0) {
                    continue;
                }
                if (firstContainer.contains() < number) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(number);
                } else {
                    firstContainer.remove(number);
                    secondContainer.add(number);
                }
                
            }
            if (command.equals("remove")) {
                secondContainer.remove(number);
            }
            System.out.println("");

        }
        
    }

}
