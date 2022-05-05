public class MainProgram {
 
    public static void main(String[] args) {
        Student first = new Student("Matthew");
        Student second = new Student("Nancy");
        Student third = new Student("Matthew");
        
        // Compare Students' names
        System.out.println(first.compareTo(second));
        System.out.println(first.compareTo(third));
    }
}