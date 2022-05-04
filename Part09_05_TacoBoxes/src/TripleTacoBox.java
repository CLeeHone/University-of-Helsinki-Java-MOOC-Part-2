/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class TripleTacoBox implements TacoBox {
 
    //instance variable
    int tacos;
 
    //parameterless constructor, object variable initialized at 3 when the constructor is called
    public TripleTacoBox() {
        this.tacos = 3;
    }
    
    //methods
    public int tacosRemaining() {
        return tacos;
    }
 
    public void eat() {
        tacos = ((tacos - 1 <= 0) ? 0 : --tacos);
    } 
}