import java.util.Scanner;

/**
 * This program calculates the average of a list of integers.
 * It reads an integer `n` from the user, which represents the number of elements.
 * Then, it reads `n` integers, computes their sum, and calculates the average.
 * Time Complexity: O(n), where `n` is the number of input elements.
 */

public class Problem_2 {
    /**
     * Computes the average of an array of integers.
     *
     * @param n The number of integers.
     * @param numbers An array containing `n` integers.
     * @return The average of the numbers as a double.
     */
    public static double findAverage(int n, int[] numbers) {
        int sum = 0;

        // Iterate over the array and calculate the sum
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        return (double) sum / n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] numbers = new int[n]; // Initialize an array to store numbers

        // Read `n` integers into the array
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Call `findAverage` with the array and print
        System.out.println(findAverage(n, numbers));

        input.close();
    }
}