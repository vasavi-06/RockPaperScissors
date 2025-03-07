import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new           
        Scanner(System.in);
        Random random = new Random();
        
        // To chose for the game
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your move (Rock, Paper, Scissors). To quit, type 'exit':");
        
        while (true) {
            String userMove = scanner.nextLine();
            
            // If  the gamer want quit the game
            if (userMove.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
            
            // The moves for the game
            if (!(userMove.equalsIgnoreCase("Rock") || userMove.equalsIgnoreCase("Paper") || userMove.equalsIgnoreCase("Scissors"))) {
                System.out.println("Invalid move! Please enter Rock, Paper, or Scissors.");
                continue;
            }
            
            // The computer moves
            int computerChoice = random.nextInt(3);
            String computerMove = choices[computerChoice];
            
            // Display choices
            System.out.println("You chose: " + userMove);
            System.out.println("The computer chose: " + computerMove);
            
            // Determine the winner
            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                       (userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
                       (userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            
            System.out.println("\nPlay again? (Enter your move or 'exit' to quit):");
        }
        
        scanner.close();
    }
}
