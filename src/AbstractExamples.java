/**
 * @author Oscar Soto on 12/2/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

import java.util.Scanner;

public class AbstractExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an even number greater than 10");
        int number = scanner.nextInt();
        VerySpecificNumberValidator validator = new VerySpecificNumberValidator(
                "Value is invalid",
                new GreaterThanValidator(
                        "Number must be greater than 10",
                        10
                ),
                new EvenNumberValidator("Enter an even number")
        );
        boolean isValid = validateNumber(number, validator);
        if (!isValid) System.out.println(validator.getErrorMessage());
    }
    private static boolean validateNumber(int number, NumericValidator validator) {
        return validator.isValid(number);
    }
}

// generic library
abstract class NumericValidator {
    private String errorMessage;
    public NumericValidator(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    abstract public boolean isValid(int number);
}
class GreaterThanValidator extends NumericValidator {
    private final int expectedMinimunValue;
    public GreaterThanValidator(String errorMessage, int expectedMinimunValue) {
        super(errorMessage);
        this.expectedMinimunValue = expectedMinimunValue;
    }
    @Override
    public boolean isValid(int number) {
        return number > expectedMinimunValue;
    }
}
class EvenNumberValidator extends NumericValidator {
    public EvenNumberValidator(String errorMessage) {
        super(errorMessage);
    }
    @Override
    public boolean isValid(int number) {
        return number % 2 == 0;
    }
}

// your specific package
class VerySpecificNumberValidator extends NumericValidator {
    private GreaterThanValidator greaterThan;
    private EvenNumberValidator eveneNumber;

    public VerySpecificNumberValidator(
            String errorMessage,
            GreaterThanValidator greaterThan,
            EvenNumberValidator eveneNumber
    ) {
        super(errorMessage);
        this.greaterThan = greaterThan;
        this.eveneNumber = eveneNumber;
    }

    @Override
    public boolean isValid(int number) {
        return greaterThan.isValid(number) && eveneNumber.isValid(number);
    }
}
