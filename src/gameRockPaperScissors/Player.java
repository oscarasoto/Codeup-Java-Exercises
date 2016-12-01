package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
class Player {
    private String name;
    private Roshambo choice;

    Roshambo getChoice() {
        return choice;
    }

    void setName(String name) {
        this.name = name;
    }

    void setChoice(Roshambo choice) {
        this.choice = choice;
    }

    public Roshambo generateRoshambo(){
        return null;
    }

    public String gameInfo() {
        return String.format("%s selected: %s", name, choice);
    }

    static Player opponentSelection(int opponent) {
        if(opponent == 1) {
            ComputerPlayer newComputerPlayer = new ComputerPlayer();
            newComputerPlayer.setName("Computer");
            newComputerPlayer.setChoice(newComputerPlayer.generateRoshambo());
            return newComputerPlayer;

        } else {
            RockPlayer newRockPlayer = new RockPlayer();
            newRockPlayer.setName("RockPlayer");
            newRockPlayer.setChoice(newRockPlayer.generateRoshambo());
            return newRockPlayer;
        }
    }

}
