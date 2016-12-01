package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class ComputerPlayer extends Player {

    ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public Roshambo generateRoshambo() {
        Roshambo roshambo = Roshambo.fromSelection(generateRandom());
        setChoice(roshambo);
        return roshambo;
    }

    private static int generateRandom () {
        return (int) Math.floor(Math.random() * 2) + 1;
    }
}
