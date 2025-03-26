import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        /**
         * This program finds the minimum number from a list of integers.
         * It reads an integer `n` from the user, which represents the number of elements.
         * Then, it reads `n` integers and determines the smallest value.
         *
         * @param n The number of integers to be processed, provided by the user.
         * @return The minimum value among the entered integers, printed to the console.
         *
         * Time Complexity: O(n), where `n` is the number of input elements.
         */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Initialize `min` with the largest possible integer value
        int min = Integer.MAX_VALUE;

        // Iterate `n` times to read input numbers and find the minimum
        for (int i = 0; i < n; i++) {
            min = Math.min(min, scanner.nextInt());
        }

        System.out.println(min);
        scanner.close();
    }
}