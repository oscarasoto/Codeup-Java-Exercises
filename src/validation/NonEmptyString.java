/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package validation;

public class NonEmptyString implements Validation {
    @Override
    public boolean isValid(Object value) {
        if (!(value instanceof String)) {
            return false; // it is invalid
        }
        return ! ((String) value).trim().isEmpty();
    }

    @Override
    public String errorMessage() {
        return "This value cannot be empty";
    }
}
