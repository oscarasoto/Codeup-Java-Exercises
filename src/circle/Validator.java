package circle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Oscar Soto on 11/30/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

public class Validator {
    private static double valid;

    static boolean isValidDouble(String radius) {

        try {
            valid = Double.parseDouble(radius);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    static double validValue() {
        return valid;
    }

}
