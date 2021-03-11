package games.blackjack;

import cards.standard.*;

class BLJUtility {

    static int calculateScore(Card c, int currScore) {

        int newScore = 0;

        String val = c.getValue();

        try {
            newScore = Integer.parseInt(val);

        } catch (NumberFormatException nfe) {
                
            switch (val.charAt(0)) {

                case 'J': 
                case 'Q': 
                case 'K': {
                    newScore = 10;
                    break;
                
                } // Jack, Queen, King

                case 'A': {
                    newScore = 11;
                    if (newScore + currScore > 21) newScore = 1;
                    break;

                } // Ace

            } // switch
            
        } // try

        return newScore + currScore;

    } // calculateScore

} // BLJUtility