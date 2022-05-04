/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.HashMap;
import java.util.ArrayList;
 
public class VehicleRegistry {
 
    private HashMap<LicensePlate, String> registry;
 
    //constructor
    public VehicleRegistry() {
        registry = new HashMap<>();
    }
 
    //methods
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }
 
    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }
 
    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }
 
    public void printLicensePlates() {
        for (LicensePlate key : registry.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerNames = new ArrayList<>();
        
        for (LicensePlate key : registry.keySet()) {
            if (ownerNames.contains(registry.get(key))) {
                System.out.println("Owner's name has already been printed");
            } else {
                System.out.println(registry.get(key));
                ownerNames.add(registry.get(key));
            }           
        }
    }
}
 