import java.util.ArrayList;
import java.util.Scanner;
 
public class PrintingUserInput {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        boolean value = true;
 
        System.out.println("Type words, pressing 'Enter' twice in a row exits");
 
        while (value) {
            String word = scanner.nextLine();
 
            if (word.isEmpty()) {
                value = false;
            } else {
                wordList.add(word);
            }
        }
        
        wordList.stream()
                .forEach(name -> System.out.println(name));
    }
}