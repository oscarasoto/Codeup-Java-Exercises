package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class RockPlayer extends Player{
    public RockPlayer(String name) {
        super(name);
    }

    @Override
    public Roshambo generateRoshambo() {
        Roshambo roshambo = Roshambo.fromSelection(1);
        setChoice(roshambo);
        return roshambo;
    }
}
