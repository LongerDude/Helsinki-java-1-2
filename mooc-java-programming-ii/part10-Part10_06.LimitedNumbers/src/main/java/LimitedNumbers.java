
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input <0){
                ArrayList<Integer> values = list.stream().filter(s -> s >= 1 && s <= 5).collect(Collectors.toCollection(ArrayList::new));
                values.stream().forEach(s -> System.out.println(s));
                break;
            }
            list.add(input);            
        }

    }
}
