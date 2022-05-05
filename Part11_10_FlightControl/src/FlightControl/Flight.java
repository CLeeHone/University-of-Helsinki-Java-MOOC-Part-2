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
public class Flight {
 
    private Airplane airplane;
    private Place departureAirport;
    private Place arrivalAirport;
 
    public Flight(Airplane airplane, Place departureAirport, Place arrivalAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }
 
    public Airplane getAirplane() {
        return airplane;
    }
 
    public Place getDeparturePlace() {
        return departureAirport;
    }
 
    public Place getArrivalPlace() {
        return arrivalAirport;
    }
 
    @Override
    public String toString() {
        return airplane.toString() + " (" + departureAirport + "-" + arrivalAirport + ")";
    }
}