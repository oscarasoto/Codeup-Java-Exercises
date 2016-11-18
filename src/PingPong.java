import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Oscar Soto.
 *
 * This class will simulates a ping pong game.
 * First player to 7 points wins!
 *
 *
 *
 * */

public class PingPong {
    public static void main(String[] args) {

        System.out.println("Welcome to Ping Pong Game");
        String userName = getUserName();
        pingPong(userName);

    }

    private static int generateRandom () {
        return (int) Math.floor(Math.random() * 2);
    }

    private static String getUserName () {
        System.out.println("Enter player name: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();

    }

    private static String getUserInput () {

        System.out.println("Enter your guess");
        Scanner sc = new Scanner(System.in);
        String userInput;

        try {

            userInput = sc.next();
            if (userInput.equalsIgnoreCase("left") || userInput.equalsIgnoreCase("right")) {
                return userInput;
            } else if (isInteger(userInput)) {
                throw new IllegalArgumentException("Please enter \"left\" or \"right\" only");
            } else {
                throw new IllegalArgumentException("Please enter \"left\" or \"right\" only");
            }

        } catch (InputMismatchException | IllegalArgumentException e){
            System.out.println("Please enter \"left\" or \"right\" only");
            return getUserInput();
        }

    }

    private static boolean isInteger(String input) {

        try
        {
            Integer.parseInt(input);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }

    private static int convertSideStringToNumber(String userInput) {
        return userInput.equalsIgnoreCase(userInput) ? 0 : 1;
    }

    private static void pingPong (String playerName) {
        int userSide;
        int ballSide;
        int userScore = 0;
        int computerScore = 0;
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("Which side of the table you would like to swing your paddle (left or right).");

            userSide = convertSideStringToNumber(getUserInput());
            ballSide = generateRandom();

            if (userSide == ballSide) {
                userScore++;
                System.out.println("Great! you have " + userScore + " points");
            } else {
                computerScore++;
                System.err.println("I have " + computerScore + " points");
            }

            if (userScore == 7){
                gameOver = true;
                System.out.println(playerName + " WINS!! you have: " + userScore + " points and I have only " + computerScore);
            } else  if (computerScore == 7){
                gameOver = true;
                System.out.println("I WIN!! I have " + computerScore + " points and " + playerName + " only has " + userScore);
            }
        }

    }

}
