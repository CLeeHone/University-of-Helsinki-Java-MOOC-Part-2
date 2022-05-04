import java.util.Scanner;
import java.util.ArrayList;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int sum = 0;
        int counter = 0;
        
        System.out.println("Enter numbers [0 to exit]:");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number >= 0) {
            	numberList.add(number);
            }
        }
        
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) > 0) {
                sum = sum + numberList.get(i);
                counter++;
            }
        }
        
        if (sum == 0) {
            System.out.println("Average cannot be calculated");
        } else {
            System.out.println("The average of the numbers is " + 1.0 * sum / counter);
        }
    }
}