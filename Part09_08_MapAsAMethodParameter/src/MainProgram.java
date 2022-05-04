import java.util.Map;
import java.util.HashMap;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");
 
        System.out.println(returnSize(names));
    }
 
    // returnSize() method takes a Map-object as a parameter and returns the size of the map object
    public static int returnSize(Map<String, String> map) {
        return map.size();
    }
}