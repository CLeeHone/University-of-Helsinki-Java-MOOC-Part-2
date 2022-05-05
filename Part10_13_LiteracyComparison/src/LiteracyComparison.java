import java.nio.file.Files;
import java.nio.file.Paths;
 
public class LiteracyComparison {
 
    public static void main(String[] args) {
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new LiteracyData(parts[3], parts[2], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .sorted()
                    .forEach(row -> System.out.println(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}