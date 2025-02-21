/**
 * Exception thrown when attempting to pop or peek at an element from an empty stack.
 * This exception indicates that no elements are available in the stack.
 *
 * @author Benjamin Gyemant
 * @version 2025-02-21
 */
public class StackEmptyException extends Exception {
    /**
     * Constructs a new StackEmptyException with the specified error message.
     *
     * @param message the detail message describing the error
     */
    public StackEmptyException(String message) {
        super(message);
    }
}