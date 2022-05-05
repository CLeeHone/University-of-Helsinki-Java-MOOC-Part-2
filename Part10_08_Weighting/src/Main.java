public class Main {
 
    public static void main(String[] args) {
        Item firstItem = new Item("Book", 2);
        Item secondItem = new Item("Laptop", 8);
        Item thirdItem = new Item("Shoes", 4);
        Item fourthItem = new Item("Keyboard", 1);
        
        Suitcase firstSuitcase = new Suitcase(15);
        Suitcase secondSuitcase = new Suitcase(20);
        
        Hold hold = new Hold(50);
        
        firstSuitcase.addItem(firstItem);
        firstSuitcase.addItem(secondItem);
        secondSuitcase.addItem(thirdItem);
        secondSuitcase.addItem(fourthItem);
        
        hold.addSuitcase(firstSuitcase);
        hold.addSuitcase(secondSuitcase);
        
        System.out.println("First suitcase's total weight: " + firstSuitcase.totalWeight());
        firstSuitcase.printItems();
        
        System.out.println("--------------");
        System.out.println("Hold's total weight: " + hold.totalWeight());
        System.out.println("Items in the suitcase:");
        hold.printItems();
       
    }
 
}