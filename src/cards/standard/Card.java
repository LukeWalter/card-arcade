package cards.standard;

public class Card {

    private Suit suit;
    private String faceValue;
    
    public Card(String v, Suit s) throws IllegalArgumentException {
        suit = s;
        setValue(v);

    } // Constructor

    public Card(Card other) {
        suit = other.suit;
        faceValue = other.faceValue;

    } // Constructor

    public Suit getSuit() {
        return suit;

    } // getSuit

    public String getFaceValue() {
        return faceValue;

    } // getValue

    public String toString() {
        if (suit == Suit.WILD) return "[WILD CARD]";
        else return "[" + faceValue + " of " + suit + "]";

    } // toString

    private void setValue(String input) {
        
        if (suit == null) throw new IllegalStateException();

        String newValue = null;

        if (suit == Suit.WILD) {
            if (input.equals("W")) newValue = input; 

        } else {

            String[] valid = {

                "2", "3", "4", "5" , "6", 
                "7", "8", "9", "10", "J", 
                "Q", "K", "A"

            };

            for (String v : valid) {
                if (input.equals(v)) newValue = input;

            } // for

        } // if

        if (newValue == null) throw new IllegalArgumentException();
        else faceValue = newValue;

    } // setValue

} // Card