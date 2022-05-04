import java.util.Scanner;
 
public class Cubes {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
 
        while (!command.equalsIgnoreCase("end")) {
            System.out.println("Enter a number");
            System.out.println("To quit the program, write 'end'");
 
            command = scanner.nextLine();
            if (!command.equalsIgnoreCase("end")) {
            	int number = Integer.valueOf(command);
            	System.out.println(Math.pow(number, 3));
            }
        }
    }
}