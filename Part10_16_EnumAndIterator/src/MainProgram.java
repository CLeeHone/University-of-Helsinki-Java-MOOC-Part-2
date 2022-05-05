public class MainProgram {
 
    public static void main(String[] args) {
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);
        System.out.println("-------------");
        
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.MA));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));
        
        Employees otherEmployees = new Employees();
        otherEmployees.add(new Person("Brian", Education.MA));
        otherEmployees.add(new Person("Patricia", Education.PHD));
        otherEmployees.add(new Person("John", Education.HS));
        
        Person Allie = new Person("Allie", Education.MA);
        
        university.add(Allie);
                
        university.print();
        System.out.println("-------------");
        
        university.print(Education.HS);
        System.out.println("-------------");
        
        university.fire(Education.PHD);
        university.print();
    }
}