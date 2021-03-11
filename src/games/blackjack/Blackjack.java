package games.blackjack;

import cards.standard.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Blackjack {

    private Player dealer;
    private Player[] players;
    private Deck deck;

    public Blackjack(int num) throws IllegalArgumentException {
        
        if (num < 1) throw new IllegalArgumentException();

        dealer = new Dealer();
        players = new Player[num];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();

        } // for

        deck = new Deck();

    } // Blackjack

    public void play() {

        startRound();
        System.out.println("You did it! You played Blackjack!");

    } // play

    public void startRound() {

        for (Player p : players) {
            p.reset();

        } // for

        deck.reset(true);
        
        ArrayList<Card> handouts = new ArrayList<>();

        for (int i = 0; i < players.length; i++) {
            handouts.add(deck.draw());
            handouts.add(deck.draw());

        } // for
        System.out.println(handouts);
        for (int i = 0; i < players.length; i++) {
            players[i].initialize(handouts.get(i), handouts.get(players.length + i));
            System.out.println(players[i].getScore());
        } // for
        
    } // startRound

} // Blackjack