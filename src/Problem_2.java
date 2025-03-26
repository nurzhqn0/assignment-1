import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        /**
         * This program calculates the average of a list of integers.
         * It first reads an integer `n` from the user, which represents the number of elements.
         * Then, it reads `n` integers, computes their sum, and calculates the average.
         * The result is printed as a floating-point number.
         *
         * @param n The number of integers to be processed, provided by the user.
         * @return The average of the entered integers as a double.
         *
         * Time Complexity: O(n), where `n` is the number of input elements.
         */

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0; // Variable to store the sum of the numbers

        // Iterate `n` times to read numbers and compute their sum
        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }

        // Calculate and print the average as a floating-point number
        System.out.println((double) sum / n);

        input.close();
    }
}