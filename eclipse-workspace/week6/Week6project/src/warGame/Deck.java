package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	 private List<Card> cards; // List of cards in the deck

	    
	    public Deck() {  // building the 52 card deck
	        cards = new ArrayList<>();
	        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
	        String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
	                            "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

	        for (String suit : suits) {
	            int count = 2; // Card values start from 2
	            for (String numberName : numbers) {
	                cards.add(new Card(numberName, suit, count));                
	                count++;
	            }
	        }
	    }

	    // Method to shuffle
	    public void shuffle() {
	        Collections.shuffle(cards);
	    }

	    // Method to draw the top card
	    public Card draw() {
	        return cards.remove(0); // Remove and return the top card
	    }
	}