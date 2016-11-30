import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * This is the class with all the validations
 *
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */


class Validator {

    // this is the class with useful validation methods

    private static int getInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println(prompt);

        try {
            userInput = sc.nextInt();
            sc.close();
            return userInput;
        } catch (InputMismatchException e) {
            return getInt(prompt);
        }

    }

    private static double getDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        double userDouble;

        System.out.println(prompt);

        try {
            userDouble = sc.nextDouble();
            return userDouble;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return getDouble(prompt);
        }
    }

    static int getIntWithinRange(String prompt, int min, int max) {
        int userInput = getInt(prompt);

        try {
            if(userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        } catch (InputMismatchException e) {
            return getIntWithinRange(prompt, min, max);
        }

    }

    private double getDoubleWithinRange(String prompt, double min, double max) {
        double userInput = getDouble(prompt);

        try {
            if(userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        } catch (InputMismatchException e) {
            return getDoubleWithinRange(prompt, min, max);
        }
    }

    private static double getPositiveDouble(String prompt) {
        double userInput = getDouble(prompt);

        try {
            if(userInput <= 0) {
                throw new InputMismatchException();
            }
            return userInput;

        } catch (InputMismatchException e) {
            return getPositiveDouble(prompt);
        }
    }

    private static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println(prompt);

        try {
            userInput = sc.nextLine();
            return userInput;
        } catch (NoSuchElementException e) {
            return getString(prompt);
        }
    }

}