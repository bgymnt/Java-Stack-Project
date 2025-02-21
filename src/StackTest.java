/**
 * Test class for demonstrating the functionality of the Stack implementation.
 * Contains test cases for Integer and String stacks, including exception handling.
 *
 * @author Benjamin Gyemant
 * @version 2025-02-21
 */
public class StackTest {
    /**
     * Main method to execute various test cases for the Stack implementation.
     * Tests include:
     * - Number Stack operations (push, pop, peek, list)
     * - Text Stack operations (push, pop, peek, list)
     * - Exception handling for empty stack operations
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Test 1: Number Stack (Integer)
            System.out.println("=== Number Stack Test ===");
            Stack<Integer> numStack = new Stack<>(5);
            numStack.push(10);
            numStack.push(20);
            numStack.push(30);
            System.out.println("List: " + numStack.list()); // Expected: 10;20;30
            System.out.println("Peek: " + numStack.peek()); // Expected: 30
            System.out.println("Pop: " + numStack.pop()); // Expected: 30
            System.out.println("List after Pop: " + numStack.list()); // Expected: 10;20

            // Test 2: Text Stack (String)
            System.out.println("\n=== Text Stack Test ===");
            Stack<String> textStack = new Stack<>(3);
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("List: " + textStack.list()); // Expected: Hello;World
            System.out.println("Pop: " + textStack.pop()); // Expected: World
            System.out.println("Peek: " + textStack.peek()); // Expected: Hello

            // Test 3: StackEmptyException
            System.out.println("\n=== StackEmptyException Test ===");
            textStack.pop(); // Delete "Hello"
                textStack.pop(); // Should throw StackEmptyException
            } catch (StackEmptyException | StackFullException e) {
                e.printStackTrace();
            }
        }
}