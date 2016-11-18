import java.util.Scanner;

/**
 * @author Oscar Soto on 11/16/16.
 *
 * There is no reasonable excuse for doing anything less than your best.
 * - Martin, Robert C.
 */

public class ValidatorTestApp {
    public static void main(String[] args) {

        Validator validator = new Validator();
        int min = -100;
        int max = 100;
        String prompt = "Enter an integer between " + min + " and " + max + " : ";
        int userInteger;

        System.out.println("Welcome to the Validation Tester application");

        userInteger = validator.getIntWithinRange(prompt, min, max);

        System.out.println("User entered: " + userInteger);

    }
}

