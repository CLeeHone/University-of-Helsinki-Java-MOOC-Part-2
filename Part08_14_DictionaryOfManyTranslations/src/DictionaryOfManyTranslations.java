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
 
public class DictionaryOfManyTranslations {
 
    //instance variable
    private HashMap<String, ArrayList<String>> dictionary;
 
    //constructor
    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }
 
    //methods
    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, new ArrayList<>());
 
        dictionary.get(word).add(translation);
    }
 
    public ArrayList<String> translate(String word) {
        if (!(dictionary.containsKey(word))) {
            return new ArrayList<String>();
        }
        return dictionary.get(word);
    }
 
    public void remove(String word) {
        dictionary.remove(word);
    }
}