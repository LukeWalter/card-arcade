package games.blackjack;

import cards.standard.*;
import java.util.Stack;

class Player {

    private int score;
    private boolean holding;
    private boolean bust;
    private Card[] privateHand;
    private Stack<Card> openHand;

    Player() {
        reset();

    } // Constructor

    void reset() {
        score = 0;
        holding = false;
        bust = false;
        privateHand = null;
        openHand = new Stack<>();

    } // reset

    void initialize(Card a, Card b) {
        
        privateHand = new Card[2];
        privateHand[0] = a;
        privateHand[1] = b;

        for (Card c : privateHand) {
            score = BLJUtility.calculateScore(c, score);

        } // for

    } // initialize

    void hit(Card c) throws IllegalStateException {
        
        if (!holding && !bust && privateHand != null) {
            openHand.push(c);
            score = BLJUtility.calculateScore(c, score);

        } // if

        throw new IllegalStateException();

    } // hit

    void hold() {
        holding = true;

    } // hold

    int getScore() {
        return score;

    } // getScore

    public String toString() {
        return openHand.toString();
        
    } // toString

} // Player