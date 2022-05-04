public class Main {
 
    public static void main(String[] args) {
        Box box = new Box(10);
 
        box.add(new Book("Nick Harkaway", "The Gone-Away World", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 40));
 
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Gunship", "Dark All Day", 2018));
 
        System.out.println(box);
        
        Box secondBox = new Box(2);
        secondBox.add(new Book("Joseph Heller", "Catch-22", 1));
        secondBox.add(new CD("The Midnight", "Endless Summer", 2016));
        box.add(secondBox);
        
        System.out.println(box);
        //The secondBox is treated as one item by box       
    }
}