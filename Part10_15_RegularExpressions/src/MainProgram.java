import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker givenTime = new Checker();
        Checker givenDate = new Checker();
 
        System.out.println("Enter a day ['sun', 'mon', 'tue', 'wed', 'etc'.]: ");
        String day = scanner.nextLine();
 
        if (givenDate.isDayOfWeek(day)) {
            System.out.println("The form is correct");
        } else {
            System.out.println("The form is incorrect");
        }
 
        System.out.println("----------------");
        System.out.println("Enter a string of vowels exclusively");
        String word = scanner.nextLine();
 
        Checker vowelWord = new Checker();
        if (vowelWord.allVowels(word)) {
            System.out.println("The form is correct");
        } else {
            System.out.println("The form is incorrect");
        }
        System.out.println("----------------\nEnter a time of day [HH:MM:SS]");
 
        String time = scanner.nextLine();
 
        if (givenTime.timeOfDay(time)) {
            System.out.println("The form is correct");
        } else {
            System.out.println("The form is incorrect");
        }
 
    }
}