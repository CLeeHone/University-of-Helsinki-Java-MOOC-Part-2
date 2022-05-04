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
 
public class BoxWithMaxWeight extends Box {
 
    //instance variable
    private ArrayList<Item> itemList = new ArrayList<>();
    private int capacity;
 
    //constructor
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }
 
    //method
    @Override
    public void add(Item item) {
        int weightSum = 0;
 
        for (int i = 0; i < itemList.size(); i++) {
            weightSum += itemList.get(i).getWeight();                
        }
        
        if (weightSum + item.getWeight() <= this.capacity) {
            itemList.add(item);
        }       
    }
    
    @Override
    public boolean isInBox(Item item) {
    	boolean answer = (itemList.contains(item) ? true : false);
        return answer;
    }
}