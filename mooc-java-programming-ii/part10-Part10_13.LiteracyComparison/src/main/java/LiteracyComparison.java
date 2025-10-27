
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((a, b) -> {return a[5].compareTo(b[5]);})// String comparison with comparable interface 
                    //somehow worked for doubles as well
                    .forEach(s -> {
                        if (s[2].contains("fe")){ // original string looks like this female (%), needed to remove the extra
                            // characters to pass the unit test
                            s[2] = "female";
                        } else {
                            s[2] = "male";
                        }
                        System.out.println(s[3].trim() + " (" + s[4].trim() + "), " + s[2].trim() + ", " + s[5].trim());
                    });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
