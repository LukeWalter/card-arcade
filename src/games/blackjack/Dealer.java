package games.blackjack;

import cards.standard.*;
import java.util.Stack;

class Dealer extends Player {

    int score;
    boolean bust;
    Stack<Card> hand;

    public Dealer() {
        super();

    } // Constructor

    @Override
    void reset() {
        score = 0;
        bust = false;
        hand = null;

    } // reset

    @Override
    void hit(Card c) throws IllegalStateException {
        
        if (!bust) {
            hand.push(c);
            score = BLJUtility.calculateScore(c, score);
        
        } // if

        throw new IllegalStateException();

    } // hit

    @Override
    public String toString() {
        return hand.toString();

    } // toString

} // Dealer