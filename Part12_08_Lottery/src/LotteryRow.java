import java.util.ArrayList;
import java.util.Random;
 
public class LotteryRow {
    //instance variable
    private ArrayList<Integer> numbersList;
 
    //constructor
    public LotteryRow() { 
        this.randomizeNumbers();
    }
 
    //methods
    public ArrayList<Integer> numbers() {
        return numbersList;
    }
 
    public boolean containsNumber(int number) {
        for (int i = 0; i < this.numbersList.size(); ++i) {
            if (this.numbersList.get(i) == number) {
                return true;
            }
        }
        return false;
    }
 
    public void randomizeNumbers() {
        numbersList = new ArrayList<>();        
        Random randomNumber = new Random();
 
        while (numbersList.size() < 7) {
            int number = randomNumber.nextInt(40) + 1;
            if (!(this.numbersList.contains(number))) {
                this.numbersList.add(number);
            }
        }
    }
}
 
