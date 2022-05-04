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
 
public class OneItemBox extends Box {
    //instance variables
    private ArrayList<Item> itemList = new ArrayList<>();
    private static final int CAPACITY = 1;
    
    //constructor
    public OneItemBox() {    
    }
    
    //method
    @Override
    public void add(Item item) {
        if (itemList.size() < CAPACITY) {
            itemList.add(item);
        }    
    }
    
   public boolean isInBox(Item item) {
	   boolean answer = (itemList.contains(item) ? true : false);
	   return answer;
   }   
}