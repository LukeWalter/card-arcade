#!/usr/bin/env sh

rm -rf bin
mkdir bin

javac -d bin src/cards/standard/Suit.java
javac -d bin -cp bin src/cards/standard/Card.java
javac -d bin -cp bin src/cards/standard/Deck.java
javac -d bin -cp bin src/cards/standard/Player.java

javac -d bin -cp bin src/play/Driver.java
java -cp bin play.Driver