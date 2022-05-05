import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
 
public class PositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-2);
        numbers.add(5);
        numbers.add(-8);
        numbers.add(10);
        
        System.out.println(positive(numbers));
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> numbersList = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toList());
        
        return numbersList;
    }
}