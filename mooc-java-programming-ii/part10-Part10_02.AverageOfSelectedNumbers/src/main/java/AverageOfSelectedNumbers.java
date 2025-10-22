
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String choice = scanner.nextLine();
                if (choice.equals("n")){
                    double negAvg = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s< 0).average().getAsDouble();
                    System.out.println("Average of the negative numbers: " + negAvg);
                } else {
                    double posAvg = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s > 0).average().getAsDouble();
                    System.out.println("Average of the positive numbers: " + posAvg);
                }
                break;
            }
            list.add(input);
        }

    }
}
