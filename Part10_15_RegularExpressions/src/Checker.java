public class Checker {
  
    //constructor
    public Checker() {
    }
 
    //methods
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
 
    public boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u)*");
    }
    
    public boolean timeOfDay(String number) {
        return (number.matches("(0|1){1}[0-9]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}") || number.matches("(2){1}[0-3]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}"));
    }
}