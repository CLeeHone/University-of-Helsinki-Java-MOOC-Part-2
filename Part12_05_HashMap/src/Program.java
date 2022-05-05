public class Program {
 
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Pair<String, Integer> newPair = new Pair<>("one", 1);
        Pair<String, Integer> secondPair = new Pair<>("two", 2);
 
        hashMap.add("one", 1);
        hashMap.add("two", 2);
        hashMap.add("three", 3);
        System.out.println(hashMap.getValue("one"));
        System.out.println(hashMap.getValue("two"));
        hashMap.remove("one");
        System.out.println(hashMap.getValue("one"));
 
    }
}