public class Main {
 
    public static void main(String[] args) {
    	TripleTacoBox box = new TripleTacoBox();
    	System.out.println("Number of tacos = " + box.tacosRemaining());
    	box.eat();
    	System.out.println("Number of tacos = " + box.tacosRemaining());
    	box.eat();
    	System.out.println("Number of tacos = " + box.tacosRemaining());
    	box.eat();
    	System.out.println("Number of tacos = " + box.tacosRemaining());
    	System.out.println("--------");
    	
    	CustomTacoBox customBox = new CustomTacoBox(2);
    	System.out.println("Number of tacos in custom box = " + customBox.tacosRemaining());
    	customBox.eat();
    	System.out.println("Number of tacos in custom box = " + customBox.tacosRemaining());
    }
}