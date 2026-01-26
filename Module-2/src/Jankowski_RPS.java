


// Importing scanner to read user input
import java.util.Scanner;
// Import Random library to run a random selection generator
import java.util.Random;

// Main class for the Rock-Paper-Scissors game,
public class Jankowski_RPS {

    // main method to start program
    public static void main(String[] args) {

        // creating scanner to retrive what the user types
        Scanner input = new Scanner(System.in);

        // making a random object to generate random numbers
        Random random = new Random();

        // random number between 1 and 3 for the computer's choice
        // nextInt(3) gives us 0, 1, or 2, so I add 1 to get 1, 2, or 3
        int computerChoice = random.nextInt(3) + 1;

        // output the instructions to user
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.println();

        // prompt user to input selection
        System.out.print("Enter your choice (1, 2, or 3): ");
        int userChoice = input.nextInt();

        // Convert the computer number to a word selection: Rock, Paper, or Scissors
        String computerChoiceWord = "";
        if (computerChoice == 1) {
            computerChoiceWord = "Rock";
        } else if (computerChoice == 2) {
            computerChoiceWord = "Paper";
        } else {
            computerChoiceWord = "Scissors";
        }

        // change user selection to a word
        String userChoiceWord = "";
        if (userChoice == 1) {
            userChoiceWord = "Rock";
        } else if (userChoice == 2) {
            userChoiceWord = "Paper";
        } else {
            userChoiceWord = "Scissors";
        }

        // display both cpu and user choice
        System.out.println();
        System.out.println("Computer chose: " + computerChoiceWord);
        System.out.println("You chose: " + userChoiceWord);
        System.out.println();

        // determining winner using game logic
        // first checking if it's a tie (both chose the same thing)
        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        }
        // does the user wins?
        // User wins if: Rock beats Scissors, Paper beats Rock, or Scissors beats Paper
        else if ((userChoice == 1 && computerChoice == 3) ||  // Rock beats Scissors
                (userChoice == 2 && computerChoice == 1) ||  // Paper beats Rock
                (userChoice == 3 && computerChoice == 2)) {  // Scissors beats Paper
            System.out.println("You win!");
        }
        // user loses results
        else {
            System.out.println("Computer wins!");
        }

        // closing the scanner when done
        input.close();
    }
}