import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
    public static void main(String[] args) {
        boolean userWantsToContinue = true;
        String userInput;

        do {

            // Ask user for number of sides
            int sides = captureNumber();
            // Simulates dice rolling
            rollDice(sides);
            rollDiceRandomClass(sides);

            // Check if the user wants to continue
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue yes/no");
            userInput = sc.nextLine();
            if (userInput.equals("no")) {
                userWantsToContinue = false;
            }

        } while (userWantsToContinue);


    }

    private static int captureNumber () {

        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice: ");
        userInput = sc.nextInt();
        return userInput;

    }

    private static void rollDice (int sides){
        int random1 = (int) (Math.random() * sides) + 1; // "sides" is the maximum and the 1 is our minimum
        int random2 = (int) (Math.random() * sides) + 1;
        System.out.println("Your Numbers are: " + random1 + " and " + random2 );
    }

    private static void rollDiceRandomClass (int sides) {
        Random rand = new Random();
        int n1 = rand.nextInt(sides) + 1; // "sides" is the maximum and the 1 is our minimum
        int n2 = rand.nextInt(sides) + 1;
        System.out.println("Your Numbers are: " + n1 + " and " + n2 );
    }
}
