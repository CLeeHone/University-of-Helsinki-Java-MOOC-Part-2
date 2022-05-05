/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;
 
/**
 *
 * @author chloe
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
 
public class FlightControl {
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places;
    
    public FlightControl() {
        this.flights = new HashMap<>();
        this.airplanes = new HashMap<>();
        this.places = new HashMap<>();
    }
 
    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        airplanes.put(ID, plane);
    }
 
    public void addFlight(Airplane plane, String departureID, String destinationID) {
        places.putIfAbsent(departureID, new Place(departureID));
        places.putIfAbsent(destinationID, new Place(destinationID));
 
        Flight flight = new Flight(plane, places.get(departureID), places.get(destinationID));
        flights.put(flight.toString(), flight);
    }
 
    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
    }
 
    public Collection<Flight> getFlights() {
        return flights.values();
    }
 
    public Airplane getAirplane(String ID) {
        return airplanes.get(ID);
    }
}