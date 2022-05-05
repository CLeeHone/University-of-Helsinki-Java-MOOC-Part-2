public class Program {
 
    public static void main(String[] args) {
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");
 
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.value(i));
        }
    }
}