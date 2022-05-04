/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Container {
 
    //instance variables
    int containerAmount = 0;
 
    //parameterless constructor
    public Container() {
    }
 
    //methods
    public int contains() {
        return this.containerAmount;
    }
 
    public void add(int amount) {
        if (amount < 0) {
            containerAmount += 0;
        } else if (containerAmount + amount > 100) {
            containerAmount = 100;
        } else {
            containerAmount += amount;
        }
    }
 
    public void remove(int amount) {
        if (amount < 0) {
            containerAmount += 0;
        } else if (containerAmount - amount < 0) {
            containerAmount = 0;
        } else {
            containerAmount -= amount;
        }
    }
 
    public String toString() {
        return containerAmount + "/100";
    }
}