public class Main {
 
    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Dark Roast", 5));
        coffeeBox.add(new Item("Light Roast", 5));
        coffeeBox.add(new Item("Medium Roast", 5));
 
        System.out.println(coffeeBox.isInBox(new Item("Dark Roast")));
        System.out.println(coffeeBox.isInBox(new Item("Light Roast")));
        System.out.println(coffeeBox.isInBox(new Item("Medium Roast")));
        System.out.println("-------------");
 
        OneItemBox box = new OneItemBox();
        box.add(new Item("Dark Roast", 5));
        box.add(new Item("Light Roast", 5));
 
        System.out.println(box.isInBox(new Item("Dark Roast")));
        System.out.println(box.isInBox(new Item("Light Roast")));
        System.out.println("-------------");
 
        MisplacingBox newBox = new MisplacingBox();
        newBox.add(new Item("Dark Roast", 5));
        newBox.add(new Item("Light Roast", 5));
 
        System.out.println(newBox.isInBox(new Item("Dark Roast")));
        System.out.println(newBox.isInBox(new Item("Light Roast")));
    }
}