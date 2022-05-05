import java.util.ArrayList;
import java.util.Scanner;
 
public class LimitedNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        boolean booleanValue = true;
 
        System.out.println("Type numbers. Typing a negative number exits program");
 
        while (booleanValue) {
            int number = Integer.valueOf(scanner.nextLine());
 
            if (number < 0) {
                booleanValue = false;
            } else {
                numberList.add(number);
            }
        }
        numberList.stream()
                .filter(value -> value >= 1 && value <= 5)
                .forEach(value -> System.out.println(value));
    }
}