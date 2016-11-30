/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package validation;

public interface Validation {
    // It only has public methods
    // No method has an implementation
    // therefore no method has a body

    public boolean isValid(Object value);
    public String errorMessage();
}
