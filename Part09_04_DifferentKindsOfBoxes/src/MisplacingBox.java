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
 
public class MisplacingBox extends Box {
    //instance variables
    ArrayList<Item> itemList = new ArrayList<>();
    
    //constructor
    public MisplacingBox() {
    }
    
    //methods
    @Override
    public void add(Item item) {
        itemList.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) { //method that returns false, even if the item in the parameter is actually in the box
        return false;
    }   
}