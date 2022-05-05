package FlightControl;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Airplane airplane = new Airplane("T254", 400);
        Place departure = new Place("Montreal");
        Place arrival = new Place("Toronto");
        
        Flight flight = new Flight(airplane, departure, arrival);
        FlightControl flightControl = new FlightControl();
        
        TextUI ui = new TextUI(flightControl, scanner);
        
        ui.start();
    }
}