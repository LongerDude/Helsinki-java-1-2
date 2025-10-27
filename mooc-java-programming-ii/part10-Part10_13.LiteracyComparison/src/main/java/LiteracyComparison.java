
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Result> results = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(word -> new Result(word[2].replace("(%)", "").trim(),word[3],Integer.valueOf(word[4]),Double.parseDouble(word[5])))
                    .forEach(result -> results.add(result));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        results.stream().sorted((result1, result2) ->{
            if (result1.getLiteracyPercent() > result2.getLiteracyPercent()) {
                return 1;
            }
            if (result1.getLiteracyPercent()< result2.getLiteracyPercent()){
                return -1;

            }
            return 0;
        }).forEach(t -> System.out.println(t));

        


    }
}
