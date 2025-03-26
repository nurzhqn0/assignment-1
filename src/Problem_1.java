import java.util.Scanner;

/**
 * This program finds the minimum number from a list of integers.
 * It reads an integer `n` from the user, which represents the number of elements.
 * Then, it reads `n` integers and determines the smallest value.
 * Time Complexity: O(n), where `n` is the number of input elements.
 */
public class Problem_1 {

    /**
     * Finds the minimum number from an array of integers.
     *
     * @param n The number of integers in the array.
     * @param numbers An array containing `n` integers.
     * @return The minimum value among the entered integers.
     */
    public static int findMinimum(int n, int[] numbers) {
        int min = Integer.MAX_VALUE;

        // Iterate through the array to find the minimum value
        for (int i = 0; i < n; i++) {
            min = Math.min(min, numbers[i]);
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n]; // Initialize an array to store numbers

        // Read `n` integers into the array
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call findMimimum method and print
        System.out.println(findMinimum(n, numbers));

        scanner.close(); // Close the scanner to free resources
    }
}