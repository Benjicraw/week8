package warGame;

public class Card {
	 private int value; // card Values (2-14)
	    private String name; // Name of the cards (from Deck class)

	    // Constructor for cards
	    public Card(String name, String suit, int value) {
	        this.name = name + " of " + suit; // Combine name and suit
	        this.value = value; // Set the card value
	    }

	    // Getter for the card's value
	    public int getValue() {
	        return value;
	    }

	    // Getter for the card's name
	    public String getName() {
	        return name;
	    }

	    // Method to describe the card
	    public void describe() {
	        System.out.println(this.name + ": " + this.value);
	    }
	}