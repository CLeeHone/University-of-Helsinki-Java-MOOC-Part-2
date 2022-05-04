/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.ArrayList;
 
public class ChangeHistory {
 
    //instance variable
    private ArrayList<Double> history = new ArrayList<>();
 
    //constructor
    public ChangeHistory() {
    }
 
    //methods
    public void add(double status) {
        history.add(status);
    }
 
    public void clear() {
        history.clear();
    }
 
    @Override
    public String toString() {
        return history.toString();
    }
 
    public double maxValue() {
        double max = 0;
 
        for (int i = 0; i < history.size(); i++) {
            if (history.isEmpty()) {
                return 0;
            }
            if (history.get(i) > max) {
                max = history.get(i);
            }
        }
        return max;
    }
    
    public double minValue() {
        double min = history.get(0);
        
        for (int i = 0; i < history.size(); i++) {
            if (history.isEmpty()) {
                return 0;
            }
            if (history.get(i) < min) {
                min = history.get(i);
            }
        }
        return min;
    }
    
    public double average() {
        int counter = 0;
        double sum = 0;
        
        for (int i = 0; i < history.size(); i++) {
            sum = sum + history.get(i);
            counter++;
        }
        return 1.0 * sum/counter;
    }
}