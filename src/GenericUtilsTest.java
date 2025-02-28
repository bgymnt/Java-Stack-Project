/**
 * Test class for demonstrating the functionality of the GenericUtils class.
 * Contains test cases for reversing arrays and summing elements of numeric arrays.
 *
 * @author Benjamin Gyemant
 * @version 2025-02-28
 */
public class GenericUtilsTest {
    /**
     * Main method to execute various test cases for the GenericUtils class.
     * Tests include:
     * - Reversing Integer and String arrays
     * - Summing Double and Integer arrays
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Test 1: Reverse Integer Array
        System.out.println("=== Reverse Integer Array ===");
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original: " + java.util.Arrays.toString(intArray));
        GenericUtils.reverse(intArray);
        System.out.println("Reversed: " + java.util.Arrays.toString(intArray));

        // Test 2: Reverse String Array
        System.out.println("\n=== Reverse String Array ===");
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("Original: " + java.util.Arrays.toString(strArray));
        GenericUtils.reverse(strArray);
        System.out.println("Reversed: " + java.util.Arrays.toString(strArray));

        // Test 3: Sum Double Array
        System.out.println("\n=== Sum Double Array ===");
        Double[] dblArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        System.out.println("Sum: " + GenericUtils.sum(dblArray));

        // Test 4: Sum Integer Array
        System.out.println("\n=== Sum Integer Array ===");
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + GenericUtils.sum(intArray2));
    }
}
