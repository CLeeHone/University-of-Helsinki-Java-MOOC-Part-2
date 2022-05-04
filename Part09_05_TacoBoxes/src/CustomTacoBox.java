/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class CustomTacoBox implements TacoBox {
 
    //instance variable
    int tacos;
 
    //constructor
    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }
    
    //methods
    public int tacosRemaining() {
        return tacos;
    }
 
    public void eat() {
        tacos = ((tacos - 1 <= 0) ? 0 : --tacos);
    }
}