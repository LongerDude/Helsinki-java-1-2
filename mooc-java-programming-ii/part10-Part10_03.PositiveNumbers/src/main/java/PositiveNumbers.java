
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(-5);
        List List = positive(list);
        System.out.println(List);

    }
    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream()
                .filter(s -> s>0)
                .collect(Collectors.toList());
    }

}
