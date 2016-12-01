package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class HumanPlayer extends Player {
    private int playerSelection;

    HumanPlayer(String name, int playerSelection) {
        super(name);
        this.playerSelection = playerSelection;
    }

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.fromSelection(playerSelection);
    }



}
