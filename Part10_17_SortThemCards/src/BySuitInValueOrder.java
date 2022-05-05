/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.Comparator;
 
public class BySuitInValueOrder implements Comparator<Card> {
 
    //constructor
    public BySuitInValueOrder() {
 
    }
    
    //methods
    public int compare(Card card1, Card card2) {
        if (card1.getSuit().ordinal() - card2.getSuit().ordinal() == 0) {
            return card1.getValue() - card2.getValue();
        } 
        
        int answer = ((card1.getSuit().ordinal() - card2.getSuit().ordinal() < 0) ? -1 : 1);
        return answer;
    }
}