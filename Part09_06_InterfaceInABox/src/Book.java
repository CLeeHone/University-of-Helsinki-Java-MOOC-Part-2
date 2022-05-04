/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Book implements Packable {
    //instance variable
    private String author;
    private String title;
    private double weight;
    
    //constructor
    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }
    
    //methods
    public double weight() {
        return weight;
    }
    
    public String toString() {
        return author + ": " + title;
    }
}