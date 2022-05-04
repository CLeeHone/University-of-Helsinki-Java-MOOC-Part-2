/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Person {
    
    //instance variable
    private String name;
    private String address;
    
    //constructor    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    //method
    public String toString() {
        return name + "\n  " + address;
    }
}