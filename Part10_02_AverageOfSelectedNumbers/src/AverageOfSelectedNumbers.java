import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfSelectedNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        boolean breaker = true;

        System.out.println("Input numbers, type 'end' to stop.");
        
        while (breaker) {
            String input = scanner.nextLine();
 
            if (input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                while (true) {
                    String answer = scanner.nextLine();
                    if (answer.equals("p")) {
                        double average = inputList.stream()
                                .mapToInt(s -> Integer.valueOf(s))
                                .filter(inputNumber -> inputNumber > 0)
                                .average()
                                .getAsDouble();
                        System.out.println("Average of the positive numbers: " + average);
                        breaker = false;
                        break;
 
                    } else {
                        double average = inputList.stream()
                                .mapToInt(s -> Integer.valueOf(s))
                                .filter(inputNumber -> inputNumber < 0)
                                .average()
                                .getAsDouble();
                        System.out.println("Average of the negative numbers: " + average);
                        breaker = false;
                        break;
                    }
                }
                
            } else {
                inputList.add(input);
            }
        }
    }
}