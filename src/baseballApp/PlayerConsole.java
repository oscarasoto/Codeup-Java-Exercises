package baseballApp; /**
 * @author Oscar Soto on 11/28/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class PlayerConsole {
    private final Scanner input;
    private final PrintStream output;

    PlayerConsole(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    void showPlayerSummary(
            double battingAverage,
            double sluggingAverage
    ) {
        output.printf(
                "Batting average: %.3f, Slugging average: %.3f%n",
                battingAverage,
                sluggingAverage
        );
    }// input

    void getAtBatsInformation(Player player, int atBatsNumber) {
        for (int i = 0; i < atBatsNumber; i++) {
            output.println("How many bases the player earned at this bat?");
            player.addAtBatBases(getBasesEarned());
        }
    }// input

    int getNumberAtBats() {
        int numberAtBats;
        output.println("Enter the number of at bats");
        numberAtBats = input.nextInt();
        return numberAtBats;
    }// input

    String getAnotherBatter() {
        output.println("Another Batter?");
        String anotherBatter = input.next();

        if (!"n".equalsIgnoreCase(anotherBatter)
                && !"y".equalsIgnoreCase(anotherBatter)) {
            return this.getAnotherBatter();
        }

        return anotherBatter;
    }// input

    int getBasesEarned() {
        try {
            int bases = input.nextInt();

            if (bases < 0 || bases > 4) {
                output.println("Please enter a number between 0 and 4");
                return this.getBasesEarned();
            }

            return bases;
        } catch (InputMismatchException e) {
            output.println("Please enter a number");
            return this.getBasesEarned();
        }
    }
}
