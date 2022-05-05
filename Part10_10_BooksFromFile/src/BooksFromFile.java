import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
    }
    
    public static List<Book> readBooks(String file) {
        List<Book> booklist = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length == 4)
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .forEach(book -> booklist.add(book));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return booklist;
    }
 
}