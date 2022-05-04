/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Teacher extends Person {
    private int salary;
    
    //constructor
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    //methods
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + salary + " euro/month";
    }
}