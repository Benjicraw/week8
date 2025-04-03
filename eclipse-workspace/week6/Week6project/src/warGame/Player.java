package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand; // List of cards in the players hand
    private int score; // players score
    private String name; // players name

    // Constructor
    public Player(String name) {
        this.name = name; // Set the players name
        this.hand = new ArrayList<>(); // set up the hand
        this.score = 0; // start score at  0
    }

    // Getter for the player name  
    public String getName() {
        return name;
    }

    // Method to describe the player and their hand
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe(); // run describe through the cards
        }
    }

    public Card flip() {
        return hand.remove(0); // Remove and return the top card
    }

    
    public void draw(Deck deck) {
        hand.add(deck.draw()); // Draw a card from deck and add to hand
    }

    public void incrementScore() {
        score++; // increase score by 1
    }

    // Getter for the players score
    public int getScore() {
        return score;
    }
}