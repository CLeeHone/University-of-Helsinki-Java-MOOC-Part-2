/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class LiteracyData implements Comparable<LiteracyData> {
 
    //instance variables
    String country;
    String gender;
    int year;
    double literacyRate;
 
    //constructor
    public LiteracyData(String country, String gender, int year, double literacyRate) {
        this.country = country;   
        this.gender = (gender.contains("female") ? "female" : "male");
        this.year = year;
        this.literacyRate = literacyRate;
    }
 
    public String getCountry() {
        return country;
    }
 
    public String getGender() {
        return gender;
    }
 
    public int getYear() {
        return year;
    }
 
    public double getLiteracyRate() {
        return literacyRate;
    }
 
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyRate;
    }
 
    @Override
    public int compareTo(LiteracyData otherData) {
        if (this.literacyRate == otherData.getLiteracyRate()) {
            return 0;
        } 
        
        int answer = (this.literacyRate > otherData.getLiteracyRate() ? 1 : -1);
        return answer;
    }
 
}