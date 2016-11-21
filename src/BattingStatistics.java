import java.util.Scanner;

/**
 * @author Oscar Soto on 11/21/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class BattingStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anotherBatter;
        int [] atBats;
        String battingAverage;
        double sluggingPercentage;

// Calculate the batting average and slugging percentage for one or more baseball/softball players.
        System.out.println("Welcome to Batting Statistics");

        do {


            atBats = new int[getNumberOfAtBats()];

            for (int i = 0; i < atBats.length; i++) {
                atBats[i] = getNumberOfBases(i);
            }

            battingAverage = calculateBattingAverage(atBats);
            sluggingPercentage = calculateSluggingPercentage(atBats);

            System.out.println("Batting average is: " + battingAverage); // This hide the format in the method.
            System.out.printf("Slugging percentage is %.3f%n4", sluggingPercentage); // Format the value received by the method.


            System.out.println("Another batter yes/no");
            anotherBatter = sc.nextLine();

        } while (anotherBatter.equalsIgnoreCase("yes"));



//    Slugging percentage is the total number of bases earned divided by the total number of at-bats.

    }

    private static int getNumberOfAtBats() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of at bats");
        return sc.nextInt();
    }

    private static int getNumberOfBases(int atBatIndex) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of bases for at Bat " + (atBatIndex+1));
        return sc.nextInt();
    }

    private static String calculateBattingAverage(int[] atBats){
        double totalNumberOfGoodAtBats = 0;
        double average;

        for (int atBat : atBats) {
            if (atBat > 0) {
                totalNumberOfGoodAtBats++;
            }
        }

        average = totalNumberOfGoodAtBats / atBats.length;
        return String.format("%.3f", average);
    }

    private static double calculateSluggingPercentage(int[] atBats){
        double numberOfBases = 0;
        double average;
        for (int atBat : atBats) {
            numberOfBases += atBat;
        }

        System.out.println(numberOfBases);
        System.out.println(atBats.length);
        average = numberOfBases / atBats.length;
        return average;
    }

}
