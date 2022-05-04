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
 
public class StorageFacility {
    //instance variables
    private HashMap<String, ArrayList<String>> storage;
    
    //constructor
    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    //methods
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (!(storage.containsKey(storageUnit))) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        storage.get(storageUnit).remove(item);
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        
        for (String key : storage.keySet()) {
            if (!storage.get(key).isEmpty()) {
                units.add(key);
            }
        }
        return units;
    }
}