 
import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        String input = "";
        
        System.out.println("Input numbers, type 'end' to stop.");
        
        while (!input.equals("end")) {
            input = scanner.nextLine();
            
            if (!input.equals("end")) {
            	inputList.add(input);
            }
        }
        
        double average = inputList.stream()
                				.mapToInt(s -> Integer.valueOf(s))
                				.average()
                				.getAsDouble();
        
        System.out.println("average of the numbers: " + average);
    }
}