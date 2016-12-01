package gameRockPaperScissors;

import java.util.Scanner;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Welcome to rock, paper, scissors game!");

        // input
        System.out.println("What is your name: ");
        String name = input.next();
        Player opponent = Player.opponentSelection(getOpponent(input));

        HumanPlayer humanPlayer = new HumanPlayer(getHumanPlayerSelection(input));
        humanPlayer.setName(name);
        humanPlayer.setChoice(humanPlayer.generateRoshambo());

        // output
        System.out.println(humanPlayer.gameInfo());
        System.out.println(opponent.gameInfo());
        System.out.println(determineWinner(opponent, humanPlayer));
    }

    private static int getOpponent(Scanner input) {
        System.out.println("Who do you want to play with (1/2): ");
        System.out.println("1) Computer Player");
        System.out.println("2) Rocks Player");
        return input.nextInt();
    }

    private static int getHumanPlayerSelection(Scanner input) {
        System.out.println("1) Rock");
        System.out.println("2) Paper");
        System.out.println("3) Scissors");
        System.out.println("Choose a number:");
        return input.nextInt();
    }

    private static String determineWinner(Player opponent, HumanPlayer humanPlayer) {
        String whoWins;
        if (humanPlayer.getChoice().isTie(opponent.getChoice())){
            whoWins = "Nobody wins";
        } else if (humanPlayer.getChoice().beats(opponent.getChoice())){
            whoWins = "You Win !!";
        } else {
            whoWins = "You Lose !!";
        }
        return whoWins;
    }

}
