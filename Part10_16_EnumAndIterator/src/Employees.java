/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;
 
public class Employees {
 
    List<Person> employeeList = new ArrayList<>();
 
    public Employees() {
    }
 
    public void add(Person personToAdd) {
        this.employeeList.add(personToAdd);
    }
 
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()               
                .forEach(personToAdd -> employeeList.add(new Person(personToAdd.getName(), personToAdd.getEducation())));                        
    }
 
    public void print() {
        Iterator<Person> iterator = employeeList.iterator();
 
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
 
    public void print(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
 
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            } 
        }
    }
 
    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
 
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
 