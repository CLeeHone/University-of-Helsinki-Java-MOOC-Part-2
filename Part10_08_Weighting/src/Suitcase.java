import java.util.ArrayList;
 
public class Suitcase {
 
    private int maximumWeight;
    private ArrayList<Item> items;
 
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
 
    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }
 
        this.items.add(Item);
    }
 
    public int totalWeight() {
        int sum = items.stream()
                .mapToInt(item -> item.getWeight())
                .sum();
 
        return sum;
    }
 
    public void printItems() {
        items.stream()
                .map(item -> item.toString())
                .forEach(name -> System.out.println(name));
    }
 
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
 
        return this.items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }
 
    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
 
        if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
 
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
 