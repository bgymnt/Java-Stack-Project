/**
 * Exception thrown when attempting to push an element onto a full stack.
 * This exception indicates that the stack has reached its maximum capacity.
 *
 * @author Benjamin Gyemant
 * @version 2025-02-21
 */
public class StackFullException extends Exception {
    /**
     * Constructs a new StackFullException with the specified error message.
     *
     * @param message the detail message describing the error
     */
    public StackFullException(String message) {
        super(message);
    }
}
