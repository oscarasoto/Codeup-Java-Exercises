/**
 * @author Oscar Soto on 11/16/16.
 *
 * This is the class with all the validations
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Validator {

    public int getInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println(prompt);

        try {
            return sc.nextInt();
        } catch (InputMismatchException e){
            return getInt(prompt);
        }
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInput = getInt(prompt);

        try {
            if (userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        } catch (InputMismatchException e) {
            return getIntWithinRange(prompt, min, max);

        }
    }


   /* public boolean validateNumber (int number) {

            return true;
        }
        return  false;
    }*/




   /*

    public double getDouble(String prompt) {

    }
    public double getDoubleWithinRange(String prompt, double min, double max) {

    }*/

}
