package warGame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {
		public static void main (String[] args) {
			Deck deck = new Deck(); // Create a new deck
	        deck.shuffle(); // Shuffle the deck

	        Player player1 = new Player("Player 1"); // Create Player 1
	        Player player2 = new Player("Player 2"); // Create Player 2

	        for (int i = 0; i < 26; i++) { // Each player draws 26 cards
	            player1.draw(deck); // Player 1 draws a card
	            player2.draw(deck); // Player 2 draws a card
	        }
	        for (int i = 0; i < 26; i++) {   
	            Card card1 = player1.flip(); // Player 1 flips a card
	            Card card2 = player2.flip(); // Player 2 flips a card

	            // Describe flipped cards
	            System.out.println(player1.getName() + " flips:");
	            card1.describe();
	            System.out.println(player2.getName() + " flips:");
	            card2.describe();

	            // Compare the values of cards  
	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore(); 
	                System.out.println(player1.getName() + " wins");// Player 1 wins, score increments
	            } else if (card1.getValue() < card2.getValue()) {
	                player2.incrementScore(); 
	                System.out.println(player2.getName() + " wins");// Player 2 wins, score increments
	            } else {
	                System.out.println("It's a tie");
	            }
	            System.out.println("Current Score: " + player1.getName() + " - " + player1.getScore() + ", " + player2.getName() + " - " + player2.getScore());
	            System.out.println();
	        	}
	            
		}
}
