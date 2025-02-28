/**
 * Utility class providing generic methods for array operations.
 * Includes methods for reversing arrays and summing elements of numeric arrays.
 *
 * @author Benjamin Gyemant
 * @version 2025-02-28
 */
public class GenericUtils {
    /**
     * Reverses the elements of the specified array.
     * The original array is modified in place.
     *
     * @param array the array to reverse
     * @param <T> the type of elements in the array
     */
    public static <T> void reverse(T[] array) {
        if (array == null || array.length <= 1) return;

        for (int i = 0; i < array.length / 2; i++) {
            T temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    /**
     * Sums the elements of the specified numeric array.
     * The sum is calculated as the double value of each element.
     *
     * @param array the array of numeric elements to sum
     * @param <T> the type of numeric elements in the array
     * @return the sum of the numeric elements
     */
    public static <T extends Number> double sum(T[] array) {
        if (array == null || array.length == 0) return 0;

        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }

        return sum;
    }
}
