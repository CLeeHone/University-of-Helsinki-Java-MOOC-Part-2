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
 
public class Herd implements Movable {
    //instance variables
    private ArrayList<Movable> organismList;
    
    //constructor
    public Herd() {
        this.organismList = new ArrayList<>();
    }
    
    public String toString(){
        String print = "";        
        for(int i = 0; i< organismList.size(); i++) {
            print = print + ((organismList.get(i).toString())) + "\n";
        }
        return print;
    }
    
    public void addToHerd(Movable movable) {
        organismList.add(movable);
    }
    
    public void move(int dx, int dy) {
        for(int i = 0; i < organismList.size(); i++) {
            organismList.get(i).move(dx, dy);
        }
    }
}