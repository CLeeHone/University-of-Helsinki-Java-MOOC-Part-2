/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.HashMap;
 
public class IOU {
    //instance variables
    private HashMap<String, Double> hashmap;
    
    //constructor
    public IOU() {
        this.hashmap = new HashMap<>();
    }
    
    //methods
    public void setSum(String toWhom, double amount) {
        hashmap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return hashmap.getOrDefault(toWhom, 1.0*0);
    }
}