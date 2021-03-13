package cards.standard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Stack;

public class Deck {

    private Stack<Card> stock;
    private Stack<Card> discard;
    private Card[] pack;

    public Deck() {
        
        pack = standardDeck;

        stock = new Stack<>();
        Collections.addAll(stock, pack);

        discard = new Stack<>();
    
    } // Constructor

    public Deck(int jokers) {

        pack = Arrays.<Card>copyOf(standardDeck, standardDeck.length + jokers);

        for (int i = standardDeck.length; i < pack.length; i++) {
            pack[i] = new Card("W", Suit.WILD);

        } // for

        stock = new Stack<>();
        Collections.addAll(stock, pack);

        discard = new Stack<>();

    } // Constructor

    public Deck(Card[] set) {
        
        pack = set;

        stock = new Stack<>();
        Collections.addAll(stock, pack);

        discard = new Stack<>();

    } // Constructor

    public Card popStock() {
        
        try {
            return stock.pop();

        } catch (EmptyStackException ese) {
            return null;

        } // try
         
    } // top

    public void pushDiscard(Card c) throws IllegalArgumentException {
        
        if (c == null) throw new IllegalArgumentException();
        discard.push(c);
         
    } // top

    public void consolidate() {

        while (!discard.empty()) {
            stock.push(discard.pop());

        } // while

    } // addBack

    public void shuffle() {

        ArrayList<Card> shuffler = new ArrayList<>();

        while (!stock.empty()) {
            shuffler.add(stock.pop());

        } // while

        int randomIndex;

        while (shuffler.size() > 0) {
            randomIndex = (int)(Math.random() * shuffler.size());
            stock.push(shuffler.remove(randomIndex));

        } // while

    } // shuffle

    public int size() {
        return stock.size();

    } // size

    public String toString() {
        return "Deck";

    } // toString

    private static final Card[] standardDeck = {
        
        new Card( "2", Suit.SPADES), new Card( "2", Suit.HEARTS), new Card( "2", Suit.CLUBS), new Card( "2", Suit.DIAMONDS), 
        new Card( "3", Suit.SPADES), new Card( "3", Suit.HEARTS), new Card( "3", Suit.CLUBS), new Card( "3", Suit.DIAMONDS), 
        new Card( "4", Suit.SPADES), new Card( "4", Suit.HEARTS), new Card( "4", Suit.CLUBS), new Card( "4", Suit.DIAMONDS), 
        new Card( "5", Suit.SPADES), new Card( "5", Suit.HEARTS), new Card( "5", Suit.CLUBS), new Card( "5", Suit.DIAMONDS), 
        new Card( "6", Suit.SPADES), new Card( "6", Suit.HEARTS), new Card( "6", Suit.CLUBS), new Card( "6", Suit.DIAMONDS), 
        new Card( "7", Suit.SPADES), new Card( "7", Suit.HEARTS), new Card( "7", Suit.CLUBS), new Card( "7", Suit.DIAMONDS), 
        new Card( "8", Suit.SPADES), new Card( "8", Suit.HEARTS), new Card( "8", Suit.CLUBS), new Card( "8", Suit.DIAMONDS), 
        new Card( "9", Suit.SPADES), new Card( "9", Suit.HEARTS), new Card( "9", Suit.CLUBS), new Card( "9", Suit.DIAMONDS), 
        new Card("10", Suit.SPADES), new Card("10", Suit.HEARTS), new Card("10", Suit.CLUBS), new Card("10", Suit.DIAMONDS), 
        new Card( "J", Suit.SPADES), new Card( "J", Suit.HEARTS), new Card( "J", Suit.CLUBS), new Card( "J", Suit.DIAMONDS), 
        new Card( "Q", Suit.SPADES), new Card( "Q", Suit.HEARTS), new Card( "Q", Suit.CLUBS), new Card( "Q", Suit.DIAMONDS), 
        new Card( "K", Suit.SPADES), new Card( "K", Suit.HEARTS), new Card( "K", Suit.CLUBS), new Card( "K", Suit.DIAMONDS), 
        new Card( "A", Suit.SPADES), new Card( "A", Suit.HEARTS), new Card( "A", Suit.CLUBS), new Card( "A", Suit.DIAMONDS)

    };

} // Deck