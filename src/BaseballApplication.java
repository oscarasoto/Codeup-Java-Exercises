import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Oscar Soto on 11/24/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

/// Procedural
// as a series of steps towards a goal (output)

// OO code
// has layers
// * Input
// * Output
// * Logic for the batters

// cohesion

public class BaseballApplication {
    public static void main(String[] args) {
        int numberAtBats;
        PlayerConsole console = new PlayerConsole(new Scanner(System.in), System.out);
        do {
            numberAtBats = console.getNumberAtBats();
            Player player = new Player(new int[numberAtBats]);

            console.getAtBatsInformation(player, numberAtBats);

            console.showPlayerSummary(
                    player.battingAverage(),
                    player.sluggingAverage()
            );

        } while ("y".equalsIgnoreCase(console.getAnotherBatter()));
    }
}

