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
import java.util.List;
 
public class Hideout<T> {
 
    //instance variables
    private T removedObject;
    private ArrayList<T> hideout;
 
    //parameterless constructor
    public Hideout() {
        hideout = new ArrayList<>(1);
    }
 
    //methods
    public void putIntoHideout(T toHide) {
        if (this.hideout.contains(toHide)) {
            System.out.println("Already in the hideout");
        } else {
            this.hideout.clear();
            this.hideout.add(toHide);
            System.out.println("Added to the hideout");
        }
    }
 
    public T takeFromHideout() {
        if (this.hideout.isEmpty()) {
            return null;
        } else {
            removedObject = hideout.get(0);
            this.hideout.clear();
        }
        return removedObject;
    }
    
    public boolean isInHideout() {
        if (hideout.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
 
}