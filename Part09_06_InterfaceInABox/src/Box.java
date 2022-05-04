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
 
public class Box implements Packable {
 
    //instance variables
    private double maxCapacity;
    private ArrayList<Packable> itemList;
 
    //constructor
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        itemList = new ArrayList<>();
    }
 
    //methods
    public void add(Packable item) {
        if (item.weight() > maxCapacity) {
            System.out.println("This item's weight exceeds the box's maximum capacity");
        } else {
            if (this.weight() + item.weight() >= maxCapacity) {
                System.out.println("This item cannot be added to the box, as the box's maximum weight capacity has been reached.");
            } else {
                itemList.add(item);
                System.out.println("Item added!");
            }
        }
    }
 
    public String toString() {
        return "Box: " + itemList.size() + " items, total weight " + this.weight() + " kg";
    }
 
    public double weight() {
        double weight = 0;
        for (int i = 0; i < itemList.size(); i++) {
            weight += itemList.get(i).weight();
        }
        return weight;
    }
}
 