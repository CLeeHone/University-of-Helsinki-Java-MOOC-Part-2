/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Organism implements Movable {
    //instance variables
    private int x = 0;
    private int y = 0;
    
    //constructor
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "x: " + x + "; y: " + y;
    }
    
    public void move(int dx, int dy) {
        this.x = x + dx;
        this.y = y + dy;
    }
}