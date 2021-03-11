#!/usr/bin/bash -e

rm -rf bin
mkdir bin

javac -d bin src/cards/standard/Suit.java
javac -d bin -cp bin src/cards/standard/Card.java
javac -d bin -cp bin src/cards/standard/Deck.java

javac -d bin -cp bin src/games/blackjack/BLJUtility.java
javac -d bin -cp bin src/games/blackjack/Player.java
javac -d bin -cp bin src/games/blackjack/Dealer.java
javac -d bin -cp bin src/games/blackjack/Blackjack.java

javac -d bin -cp bin src/play/Driver.java
java -cp bin play.Driver