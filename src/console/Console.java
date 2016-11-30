/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package console;

import validation.Validation;

import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public String askForText(String message, Validation validation) {
        output.println(message);
        String text = input.next();

        if (!validation.isValid(text)) {
            output.println(validation.errorMessage());
            return askForText(message, validation);
        }

        return text;
    }

    public int askForNumber(String message, Validation validation) {
        output.println(message);
        int number = input.nextInt();

        if (!validation.isValid(number)) {
            output.println(validation.errorMessage());
            return askForNumber(message, validation);
        }

        return number;
    }
}
