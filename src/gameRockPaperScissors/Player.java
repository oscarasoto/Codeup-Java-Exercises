package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class Player {
    private String name;
    private Roshambo choice;

    Player(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    void setChoice(Roshambo choice) {
        this.choice = choice;
    }

    public Roshambo generateRoshambo(){
        return null;
    }

    String gameInfo() {
        return String.format("%s selected: %s", name, choice);
    }

    static Player opponentSelection(int opponent) {
        if(opponent == 1) {
            return new ComputerPlayer("Computer");
        }
        return new RockPlayer("RockPlayer");
    }

    boolean tiesWith(Player opponent) {
        return choice.isTie(opponent.choice)    ;
    }

    boolean defeats(Player opponent) {
        return choice.beats(opponent.choice);
    }
}
