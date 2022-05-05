/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.ArrayList;
 
public class HashMap<K, V> {
 
    private ArrayList<ArrayList<Pair<K, V>>> arrayListOfArrayLists;
    private int hashSize;
 
    public HashMap() {
        arrayListOfArrayLists = new ArrayList<>();
        hashSize = 15;
    }
 
    public V getValue(K key) { //return the value associated with the key in the method's parameter
 
        int hashValue = Math.abs(key.hashCode() % hashSize);
 
        if (this.arrayListOfArrayLists.get(hashValue).isEmpty()) {
            System.out.println("This key could not be found.");
            return null;
        }
 
        ArrayList<Pair<K, V>> valuesAtIndex = this.arrayListOfArrayLists.get(hashValue);
 
        for (int i = 0; i < valuesAtIndex.size(); ++i) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        System.out.println("This key could not be found.");
        return null;
    }
 
    public void add(K key, V value) { //add a Pair object to an ArrayList within ArrayListOfArrayLists
        ArrayList<Pair<K, V>> valuesAtIndex = getArrayListFromKey(key); //create a new ArrayList to be added to ArrayListOfArrayLists  
 
        int index = getIndexOfKey(valuesAtIndex, key); //determine what index the new ArrayList can take in ArrayListOfArrayLists
 
        if (index < 0) { // if the value is negative, that means that key has not yet been added
            valuesAtIndex.add(new Pair<>(key, value)); // a new Pair object is added to the ArrayList valuesAtIndex
            System.out.println("Pair added.");
        } else { //that key is already in use, so the value at that key is modified
            valuesAtIndex.get(index).setValue(value);
        }
    }
 
    private ArrayList<Pair<K, V>> getArrayListFromKey(K key) {
        int hashValue = Math.abs(key.hashCode() % hashSize);
        
        System.out.println("hashvalue is " + hashValue);
        
        if (arrayListOfArrayLists.isEmpty()) {
            for (int i = arrayListOfArrayLists.size(); i <= hashSize; ++i) {
                ArrayList<Pair<K, V>> newArrayList = new ArrayList<>();
                arrayListOfArrayLists.add(newArrayList);
                System.out.println("arrayListOfArrayLists size is: " + arrayListOfArrayLists.size());
            }
        }
        System.out.println(arrayListOfArrayLists.size());
        return arrayListOfArrayLists.get(hashValue);
    }
 
    private int getIndexOfKey(ArrayList<Pair<K, V>> indexOfArrayList, K key) { // 
        for (int i = 0; i < indexOfArrayList.size(); ++i) {
            if (indexOfArrayList.get(i).getKey().equals(key)) {
                return i; // the key is already in use, returns index
            }
        }
        return -1; //the key has not yet been used
    }
 
    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getArrayListFromKey(key);
 
        if (valuesAtIndex.isEmpty()) {
            return null;
        }
 
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
 
        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
 
}