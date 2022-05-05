/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Dog extends Animal implements NoiseCapable {
    
    //constructors
    public Dog() {
        super("Dog");
    }
    
    public Dog(String name) {
        super(name);
    }
    
    //methods
    public void bark() {
        System.out.println(this.name + " barks");
    }
        
    public void makeNoise() {
        bark();
    }
}