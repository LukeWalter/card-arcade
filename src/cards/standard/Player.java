package cards.standard;

import java.util.ArrayList;

public abstract class Player {

    protected int score;
    protected ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<>();
        score = 0;

    } // Player

    public boolean emptyHand() {
        return hand.isEmpty();
        
    } // isEmpty

    public boolean holding(Card c) {
        return hand.contains(c);

    } // isInHand

    public void draw(Deck d) {
        hand.add(d.popStock());

    } // pickUp

    public Card discard(Card c) throws IllegalArgumentException {
        
        boolean inHand = hand.remove(c);
        
        if (inHand) return c;
        else throw new IllegalArgumentException();

    } // play

    public int getScore() {
        return score;

    } // getScore

    public void addToScore(int roundScore) {
        score += roundScore;

    } // addToScore

    public abstract int calculateRoundScore();

} // Player