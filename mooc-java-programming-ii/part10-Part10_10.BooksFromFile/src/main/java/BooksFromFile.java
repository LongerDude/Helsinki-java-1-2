
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
    }
    public static List<Book> readBooks(String file){
        List<Book> rows = null;
        try {
            rows = Files.lines(Paths.get(file))
                    .map(row -> row.split(",")) // create an array of words in the current row
                    .filter(parts-> parts.length >=4) // restrict to 4  elements or greater arrays for the constructor. 
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]),Integer.valueOf(parts[2]), parts[3])) // create book objects from each row.
                    .collect(Collectors.toList()); // collect into  a list var.
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rows;
    }

}
