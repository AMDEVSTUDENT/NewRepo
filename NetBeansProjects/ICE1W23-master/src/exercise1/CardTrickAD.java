package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Amrit
 * @date June 2, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }
        
        // Debug statement to print the generated cards
        System.out.println("Generated cards:");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();

        System.out.print("Enter the value of your card: ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (1-4): ");
        int userSuit = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]);
        
        boolean found = false;
        
        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            printInfo();
        }
    }

    /**
     * A simple method to print out personal information.
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Amrit, but you can call me A:M");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Software Designer");
        System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Basketball");
        System.out.println("-- Music");
        System.out.println("-- Editing/Production");

        System.out.println();
    }
}
