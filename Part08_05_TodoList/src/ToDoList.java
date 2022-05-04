/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.ArrayList;
 
public class ToDoList {
    //instance variables
    private ArrayList<String> list;
    
    //parameterless constructor
    public ToDoList() {
        list = new ArrayList<>();
    }
    
    //methods
    public void add(String task) {
        list.add(task);
    }
    
    public void print() {
        int counter = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(counter + ": " + list.get(i));
            counter++;
        }
    }
    
    public void remove(int number) {
        list.remove(number - 1);
    }
}
 