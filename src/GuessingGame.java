import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author Oscar Soto.
 *
 * This class will simulates a high-low guessing game.
 * The specs for the game are:
 * Game picks a random number between 1 and 100.
 * Prompts user to guess the numberAll user inputs are validated
 * If user's guess is less than the number, it outputs "HIGHER"
 * If user's guess is more than the number, it outputs "LOWER"
 * If a user guesses the number, the game should declare "GOOD GUESS!"
 *
 * */

public class GuessingGame {
    public static void main(String[] args) {
        String userInput;
        int random;

        System.out.println("Welcome to Guessing Game");

        do {

            random = generateRandom();
            guessNumber(random);

            // Check if the user wants to continue
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue yes/no");
            userInput = sc.nextLine();

        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!!");
    }

    private static int generateRandom () {
        return (int) Math.floor((Math.random() * 100) + 1);
    }

    private static void guessNumber (int target) {
        int rounds = 1;
        int userInput;
        boolean gameOver = false;

        System.out.println("I'm thinking a number");

        while (!gameOver) {

            userInput = getUserInput();

            if (userInput > target) {
                System.out.println("Hint: LOWER !");
                rounds++;
            } else if (userInput < target) {
                System.out.println("Hint: HIGHER !");
                rounds++;
            } else {
                System.out.println("You are correct, it took you " + rounds + " guesses to find my number");
                gameOver = true;
            }

        }

    }

    private static int getUserInput () {

            System.out.println("Enter your guess");
            Scanner sc = new Scanner(System.in);

            try {
                return sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Please enter a whole number only");
                return getUserInput();
            }
    }




}
