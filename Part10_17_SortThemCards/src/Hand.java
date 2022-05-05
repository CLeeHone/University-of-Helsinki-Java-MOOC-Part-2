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
import java.util.Collections;
import java.util.Iterator;
 
public class Hand implements Comparable<Hand> {
 
    //instance variables
    private ArrayList<Card> cardsInHand;
 
    //constructor
    public Hand() {
        cardsInHand = new ArrayList<>();
    }
 
    //methods
    public void add(Card card) {
        cardsInHand.add(card);
    }
 
    public void print() {
        cardsInHand.stream()
                .forEach(card -> System.out.println(card.toString()));
    }
 
    public void sort() {
        cardsInHand.stream()
                .sorted()
                .forEach(card -> System.out.println(card.toString()));
    }
 
    public int sum() {
        int handValue = 0;
 
        Iterator<Card> iterator = cardsInHand.iterator();
 
        while (iterator.hasNext()) {
            handValue = handValue + iterator.next().getValue();
        }
        return handValue;
    }
 
    public void sortBySuit() {
        Collections.sort(cardsInHand, new BySuitInValueOrder());
    }
 
    @Override
    public int compareTo(Hand otherHand) {
        if (this.sum() - otherHand.sum() == 0) {
            return 0;
        } 
        
        int answer = ((this.sum() - otherHand.sum() < 0) ? -1 : 1);
        return answer;
    }
}
 