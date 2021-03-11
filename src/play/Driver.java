package play;

import cards.standard.*;
import games.blackjack.*;

public class Driver {

    public static void run(Runnable r) {
        r.run();
         
    } // run
    public static void main(String[] args) {

        Blackjack blj = new Blackjack(1);

        blj.play();
        
    } // main

} // Driver