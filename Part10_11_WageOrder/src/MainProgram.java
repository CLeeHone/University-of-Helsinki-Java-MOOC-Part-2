import java.util.ArrayList;
import java.util.Collections;
 
public class MainProgram {
 
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Olivia", 150000));
        humans.add(new Human("Ellie", 50000));
        humans.add(new Human("Max", 80000));
 
        System.out.println(humans);
        
        Collections.sort(humans);
        System.out.println(humans);
 
    }
}