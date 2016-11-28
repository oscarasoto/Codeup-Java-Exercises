package BaseballApp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Oscar Soto on 11/24/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

/// Procedural
// as a series of steps towards a goal (output)

// Object Oriented code
// has layers
// * Input
// * Output
// * Logic for the batters

// cohesion

public class BaseballApplication {
    public static void main(String[] args) {
        int numberAtBats;
        // object creation
        PlayerConsole console = new PlayerConsole(new Scanner(System.in), System.out);

        do {
            Player player = new Player(new ArrayList<>());
            // input
            numberAtBats = console.getNumberAtBats();
            console.getAtBatsInformation(player, numberAtBats);

            // output
            console.showPlayerSummary(
                    player.battingAverage(),
                    player.sluggingAverage()
            );

        } while ("y".equalsIgnoreCase(console.getAnotherBatter()));
    }
}

