package play;

import cards.standard.*;

public class Driver {

    public static void run(Runnable r) {
        r.run();
         
    } // run
    public static void main(String[] args) {

        Deck d = new Deck();
        System.out.println(d.popStock());
        
    } // main

} // Driver