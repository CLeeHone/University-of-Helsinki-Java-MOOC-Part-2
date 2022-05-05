import java.util.Random;
import java.util.Scanner;
 
public class Program {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
 
        System.out.println("How many numbers should be printed?");
        
        int number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("-----");
 
        for (int i = 0; i < number; ++i) {
            int randomNumber = randomGenerator.nextInt(11);
            System.out.println(randomNumber);
        }
    }
}