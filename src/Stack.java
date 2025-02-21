/**
 * A generic stack implementation that stores elements of type T.
 * The stack has a fixed capacity defined at creation time.
 *
 * @param <T> the type of elements stored in the stack
 * @author Benjamin Gyemant
 * @version 2025-02-21
 **/
public class Stack<T> {
    private Object[] elements;
    private int top;

    /**
     * Constructs a stack with default capacity of 10 elements.
     */
    public Stack() {
        this(10);
    }

    /**
     * Constructs a stack with the specified capacity.
     *
     * @param size the maximum number of elements the stack can hold
     */
    public Stack(int size) {
        elements = new Object[size];
        top = -1;
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element the element to push onto the stack
     */
    public void push(T element) throws StackFullException {
        if (top == elements.length - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = element;
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element at the top of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top--];
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top];
    }

    /**
     * Returns a string representation of the stack elements,
     * separated by semicolons.
     *
     * @return a string containing all stack elements
     */
    public String list() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            result.append(elements[i]);
            if (i < top) {
                result.append(";");
            }
        }
        return result.toString();
    }
}
