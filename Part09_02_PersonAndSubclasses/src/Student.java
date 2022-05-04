/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Student extends Person {
    //instance variables
    private int credits = 0;
    
    //constructor
    public Student(String name, String address) {
        super(name, address);
    }
 
    //methods
    public void study() { //adds one credit to the student record
        credits++;
    }
    
    public int credits() { //returns the number of credits the student has achieved
        return credits;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
    }
}