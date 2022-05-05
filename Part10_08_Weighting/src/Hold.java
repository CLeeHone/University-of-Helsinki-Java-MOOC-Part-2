 
import java.util.ArrayList;
 
public class Hold {
    
	private int maximumWeight; 
    private ArrayList<Suitcase> suitcases;
 
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<>();
    }
 
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() > maximumWeight) {
            return;
        }
 
        this.suitcases.add(suitcase);
    }
 
    public int totalWeight() {
        int sum = suitcases.stream()
                .mapToInt(suitcase -> suitcase.totalWeight())
                .sum();
 
        return sum;
    }
 
    public void printItems() {
        suitcases.stream()
                .forEach(suitcase -> suitcase.printItems());
    }
 
    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
 
        if (suitcases.size() == 1) {
            return "1 suitcase (" + totalWeight() + " kg)";
        }
 
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}