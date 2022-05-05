import java.util.Scanner;
import java.util.ArrayList;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, [enter/return] exits the program: ");
            String bookName = scanner.nextLine();
            
            if (bookName.isEmpty()) {
                break;
            }            
            System.out.println("Input the minimum age recommendation in years: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            Book book = new Book(bookName, ageRecommendation);
            
            bookList.add(book);
        }
        // Count the number of books
        long count = bookList.stream().count();
        System.out.println(count + " books in total.");
        
        // Print each book in the bookList
        System.out.println("Books:");
        bookList.stream()
                .sorted()
                .forEach(book -> System.out.println(book.toString()));
    }
}