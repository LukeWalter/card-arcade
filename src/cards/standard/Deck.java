package cards.standard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Stack;

public class Deck {

    private Stack<Card> deck;
    private Card[] fullDeck;

    public Deck() {
        fullDeck = standardDeck;
        reset(false);
    
    } // Constructor

    public Deck(int jokers) {

        fullDeck = Arrays.<Card>copyOf(standardDeck, standardDeck.length + jokers);

        for (int i = standardDeck.length; i < fullDeck.length; i++) {
            fullDeck[i] = new Card("W of WILD");

        } // for

        reset(false);

    } // Constructor

    public Deck(Card[] set) {
        fullDeck = set;
        reset(false);

    } // Constructor

    public void reset(boolean shuffling) throws IllegalStateException {
        
        if (fullDeck == null) throw new IllegalStateException(); 
        
        deck = new Stack<>();
        Collections.addAll(deck, fullDeck);

        if (shuffling) shuffle();

    } // reset

    public Card draw() {
        
        try {
            return deck.pop();

        } catch (EmptyStackException ese) {
            return null;

        } // try
         
    } // top

    public void shuffle() {

        ArrayList<Card> shuffler = new ArrayList<>();

        while (!deck.empty()) {
            shuffler.add(deck.pop());

        } // while

        int randomIndex;

        while (shuffler.size() > 0) {
            randomIndex = (int)(Math.random() * shuffler.size());
            deck.push(shuffler.remove(randomIndex));

        } // while

    } // shuffle



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