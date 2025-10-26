
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                String text = list.stream().reduce("", (previousWord, newWord) -> previousWord + newWord + "\n");
                System.out.println(text);
                break;
            }
            list.add(input);
        }

    }
}
