import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculate the batting average and slugging percentage for one or more baseball/softball players.
 *
 * @author Oscar Soto on 11/21/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class BattingStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] atBats;

        System.out.println("Welcome to Batting Statistics");

        atBats = new int[getNumberOfBatters()][getNumberOfAtBats()];

        for (int batterIndex = 0; batterIndex < atBats.length; batterIndex++){

            for (int atBatIndex = 0; atBatIndex < atBats[batterIndex].length; atBatIndex++) {
                atBats[batterIndex][atBatIndex] = getNumberOfBases(batterIndex, atBatIndex);
            }

        }

        for (int batterIndex = 0; batterIndex < atBats.length; batterIndex++){
            System.out.println("Batter " + (batterIndex+1) + " average: " + calculateBattingAverage(atBats[batterIndex], atBats.length)
                    + "    slugging percentage: " + calculateSluggingPercentage(atBats[batterIndex], atBats.length));

        }


        sc.close();

    }

    private static int getNumberOfBatters() {
        Scanner sc = new Scanner((System.in));
        int numberOfBatters;
        System.out.println("Please enter the number of batters");

        try {
            numberOfBatters = sc.nextInt();
            if (numberOfBatters > 0){
                return numberOfBatters;
            } else {
                throw new IllegalArgumentException("Please enter positive integers only");
            }

        } catch (InputMismatchException | IllegalArgumentException e) {
            return getNumberOfBatters();

        }

    }

    private static int getNumberOfAtBats() {
        Scanner sc = new Scanner(System.in);
        int numberOfAtBats;
        System.out.println("Please enter the number of at bats, (only positive integers)");

        try {
            numberOfAtBats = sc.nextInt();
            if (numberOfAtBats > 0){
                return numberOfAtBats;
            } else {
                throw new IllegalArgumentException("Please enter positive integers only");
            }


        } catch (InputMismatchException | IllegalArgumentException e) {
            return getNumberOfAtBats();

        }

    }

    private static int getNumberOfBases(int batterIndex, int atBatIndex) {
        Scanner sc = new Scanner(System.in);
        int numberOfBases;
        System.out.println("Please enter the number of bases for batter " + (batterIndex+1) +
                " for at Bat " + (atBatIndex+1) + " (only positive integers from 0 to 4)");

        try {
            numberOfBases = sc.nextInt();
            if (numberOfBases >= 0 && numberOfBases <= 4) {
                return numberOfBases;
            } else {
                throw new IllegalArgumentException("Please enter positive integers only");
            }

        } catch (InputMismatchException | IllegalArgumentException e) {
            return getNumberOfBases(batterIndex, atBatIndex);

        }
    }

    private static String calculateBattingAverage(int[] batterData, int totalAtBats){
        double countOfHits = 0;
        double battingAverage;

        for (int data : batterData){
            if (data > 0) {
                countOfHits++;
                System.out.println(data);
            }
        }
        System.out.println(countOfHits);
        System.out.println(totalAtBats);
        battingAverage = countOfHits / totalAtBats;

        return String.format("%.3f",battingAverage);
    }

    private static String calculateSluggingPercentage(int[] batterData, int totalAtBats){
        double sumOfBases = 0;
        double sluggingPercentage;

        for (int numberOfBases : batterData){
            sumOfBases += numberOfBases;
        }
        sluggingPercentage = sumOfBases / totalAtBats;

        return String.format("%.3f",sluggingPercentage);
    }


}
