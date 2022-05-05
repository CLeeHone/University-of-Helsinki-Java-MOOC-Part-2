import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class ReadingFilesPerLine {
 
    public static void main(String[] args) {
    	// Test the method here
        Scanner scanner = new Scanner(System.in);
    }
 
    public static List<String> read(String file) {
        List<String> fileRows = new ArrayList<>();
 
        try {
            Files.lines(Paths.get(file)).forEach(row -> fileRows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return fileRows;
    }
}