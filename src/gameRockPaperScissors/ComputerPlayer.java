package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class ComputerPlayer extends Player {

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.fromSelection(generateRandom());
    }

    private static int generateRandom () {
        return (int) Math.floor(Math.random() * 2) + 1;
    }
}
