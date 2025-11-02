package title;
import javafx.application.Application;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Title?");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String param = "--title=" + title;
        Application.launch(UserTitle.class, param);

    }

}
