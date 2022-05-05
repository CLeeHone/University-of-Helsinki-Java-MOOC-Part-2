/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Book implements Comparable<Book> {
    //instance variable
    String title;
    int recommendedAge;
    
    //constructor
    public Book(String title, int recommendedAge) {
        this.title = title;
        this.recommendedAge = recommendedAge;
    }
    
    //methods
    public String getTitle() {
        return title;
    }
    
    public int getRecommendedAge() {
        return recommendedAge;
    }
    
    @Override
    public String toString() {
        return title + " (recommended for " + recommendedAge + " year-olds or older)";
    }
    
    @Override
    public int compareTo(Book otherBook) {
        if (this.recommendedAge == otherBook.getRecommendedAge()) {
            return this.title.compareToIgnoreCase(otherBook.title);
        } 
        
        int answer = ((this.recommendedAge < otherBook.recommendedAge) ? -1 : 1);
        return answer;
    }    
}