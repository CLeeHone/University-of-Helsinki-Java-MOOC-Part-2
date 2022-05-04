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
 
public class Abbreviations {
    //instance variables
    HashMap<String, String> abbreviationHM = new HashMap<>();
    
    //parameterless constructor
    public Abbreviations() {
        this.abbreviationHM  = new HashMap<>();
    }
    
    //methods
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationHM.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationHM.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {   
        String answer = (abbreviationHM.containsKey(abbreviation) ? abbreviationHM.get(abbreviation) : null);
        return answer;
    }
}
 