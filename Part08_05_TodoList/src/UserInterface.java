/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.Scanner;
        
public class UserInterface {
    
    //instance variables
    private ToDoList list;
    private Scanner scanner;
    
    //constructor
    public UserInterface(ToDoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    //methods
    public void start() {
        while (true) {
            System.out.println("Command [add, list, remove, stop]:");
            String command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            if (command.equalsIgnoreCase("add")) {
                String task = scanner.nextLine();
                this.list.add(task);
            }
            if (command.equalsIgnoreCase("list")) {
                list.print();
            }
            if (command.equalsIgnoreCase("remove")) {
                System.out.println("Which one is to be removed?");               
                int index = Integer.valueOf(scanner.nextLine());
                list.remove(index);
            }
        }
    }   
}