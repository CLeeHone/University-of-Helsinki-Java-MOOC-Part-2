import java.util.ArrayList;
 
public class Main {
 
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        System.out.println(ada + "\n");
 
        Student adaStudent = new Student("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        adaStudent.study();
        adaStudent.study();
 
        System.out.println(adaStudent.credits() + "\n");
 
        Teacher Adam = new Teacher("Adam", "123 Surfer's Drive", 5000);
 
        System.out.println(Adam + "\n");
 
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
 
        printPersons(persons);
    }
 
    //method
    public static void printPersons(ArrayList<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i) instanceof Teacher) {
                System.out.println(persons.get(i).toString() + "\n");
            }
            if (persons.get(i) instanceof Student) {
                System.out.println(persons.get(i).toString() + "\n");
            }
        }
    }
}