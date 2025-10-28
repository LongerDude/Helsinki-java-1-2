
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author salma
 */
import java.util.Comparator;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
       
        
        
        
        Collections.sort(cards, (c1, c2) -> {
            if (c1.getSuit().ordinal() - c2.getSuit().ordinal() == 0) {
                return c1.getValue() - c2.getValue();
            } else {
                return c1.getSuit().ordinal() - c2.getSuit().ordinal();
            }
        });

    }

    @Override
    public int compareTo(Hand hand) {
        int sum1 = this.cards.stream().mapToInt(s -> s.getValue()).sum();
        int sum2 = 0;
        Iterator<Card> iterator = hand.cards.iterator();
        while (iterator.hasNext()) {
            sum2 += iterator.next().getValue();
        }
        if (sum1 == sum2) {
            return 0;
        } else if (sum1 > sum2) {
            return 1;
        } else {
            return -1;
        }

    }

}
