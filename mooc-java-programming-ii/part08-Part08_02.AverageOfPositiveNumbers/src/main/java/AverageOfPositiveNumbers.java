
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println((float) sum / count);
                break;

                //todo
            }
            if (input > 0) {
                sum += input;
                count++;

            }

        }

    }
}
