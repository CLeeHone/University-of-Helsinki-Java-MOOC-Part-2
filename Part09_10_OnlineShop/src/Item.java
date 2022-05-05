/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Item {
 
    //instance variables
    private String product;
    private int quantity;
    private int unitPrice;
 
    //constructor
    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
 
    //methods
    public int price() {
        return quantity * unitPrice;
    }
    
    public void increaseQuantity() {
        quantity++;
    }
    
    public String toString() {
        return product + ": " + quantity;
    }
}