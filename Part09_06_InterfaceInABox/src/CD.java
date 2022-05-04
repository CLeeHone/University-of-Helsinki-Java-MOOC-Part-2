/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class CD implements Packable {
    //instance variables
    String artist;
    String name;
    int year;
    double weight;
    
    //constructor
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }
    
    //methods
    public double weight() {
        return weight;
    }
    
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }
}