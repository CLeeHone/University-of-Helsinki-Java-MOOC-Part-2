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
import java.util.Set;
import java.util.HashMap;
 
public class Warehouse {
 
    //instance variable
    private Map<String, Integer> productAndPrice = new HashMap<>();
    private Map<String, Integer> productAndStock = new HashMap<>();
 
    //methods
    public void addProduct(String product, int price, int stock) {
        this.productAndPrice.put(product, price);
        this.productAndStock.put(product, stock);
    }
 
    public int price(String product) {
        if (!productAndPrice.containsKey(product)) {
            return -99;
        }
        return productAndPrice.get(product);
    }
 
    public int stock(String product) {
        if (!productAndStock.containsKey(product)) {
            return 0;
        }
        return productAndStock.get(product);
    }
 
    public boolean take(String product) {
        if (!productAndStock.containsKey(product)) {
            return false;
        }
 
        if (productAndStock.get(product) - 1 >= 0) {
            productAndStock.put(product, productAndStock.get(product) - 1);
            return true;
        } else {
            productAndStock.put(product, 0);
            return false;
        }
    }
    
    public Set<String> products() {
        return productAndPrice.keySet();
    }
}