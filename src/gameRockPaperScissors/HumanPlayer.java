package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class HumanPlayer extends Player {
    private int playerSelection;

    public HumanPlayer(int playerSelection) {
        this.playerSelection = playerSelection;
    }

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.fromSelection(playerSelection);
    }



}
