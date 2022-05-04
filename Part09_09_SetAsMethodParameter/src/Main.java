import java.util.Set;
import java.util.HashSet;
 
public class Main {
 
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");
 
        System.out.println(returnSize(names));
    }
 
    // Returns the number of elements in the set
    public static int returnSize(Set<String> set) {
        return set.size();
    }
}