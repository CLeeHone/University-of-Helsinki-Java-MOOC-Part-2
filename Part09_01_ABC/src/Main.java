public class Main {
 
    public static void main(String[] args) {
    	C c = new C();
    	
    	// c inherits A class' a() method and B class' b() method 
        c.a();
        c.b();
        c.c();
        
        System.out.println("--------");
        // b inherits A class' a() method
        B b = new B();
        b.a();
        b.b();
    }
}
 