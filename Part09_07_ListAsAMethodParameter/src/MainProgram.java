import java.util.List;
import java.util.ArrayList;
 
public class MainProgram {
 
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
 
        System.out.println(returnSize(names));
    }
 
    // returnSize() method returns the size of the list given to it as a parameter
    public static int returnSize(List<String> object) {
        return object.size();
    }
}