/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.Map;
import java.util.HashMap;
 
public class ShoppingCart {
 
    //instance variables
    private Map<String, Item> itemsInCart = new HashMap<>();
 
    //parameterless constructor
    public ShoppingCart() {
    }
 
    //methods
    public void add(String product, int price) {
        if (itemsInCart.keySet().contains(product)) {
            itemsInCart.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            itemsInCart.put(product, item);
        }
    }
 
    public int price() {
        int sum = 0;
        for (String storeItem : itemsInCart.keySet()) {
            sum = sum + itemsInCart.get(storeItem).price();
        }
        return sum;
    }
 
    public void print() {
        for (String i : itemsInCart.keySet()) {
            System.out.println(itemsInCart.get(i));
        }
    }
}