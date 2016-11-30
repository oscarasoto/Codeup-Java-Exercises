package baseballApp;

import java.util.List;

/**
 * @author Oscar Soto on 11/28/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

// Package visibility
// * public available to everyone
// *   package level - available to the classes inside the package

// types of methods

// * static
//       to the class: baseballApp.Player
//       baseballApp.Player.sluggingAverage();  //
// * instance
//     baseballApp.Player player = new baseballApp.Player(atBats); // creating an instance (object)
//     player.sluggingAverage();


// Object = data + operations (behaviour)

class Player {

    private List<Integer> atBats;

    // constructor ?
    Player(List<Integer> atBats) {
        this.atBats = atBats;
    }

    void addAtBatBases(int basesEarned) {
        atBats.add(basesEarned);
    }

    // belongs to the class
    // static -> instance
    double sluggingAverage() {
        double sumOfBases = 0;
        for (int numberOfBases : atBats) {
            sumOfBases += numberOfBases;
        }
        return sumOfBases / atBats.size();
    }

    // belongs to the class
    // static -> instance
    double battingAverage() {
        double countOfHits = 0;
        for (int numberOfBases : atBats) {
            if (numberOfBases > 0) {
                countOfHits++;
            }
        }
        return countOfHits / atBats.size();
    }
}
