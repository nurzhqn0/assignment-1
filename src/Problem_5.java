import java.util.Scanner;

/**
 * This program computes the N-th Fibonacci number using recursion.
 * It reads an integer `n` from the user and calculates the Fibonacci number at position `n`.
 * Fibonacci Sequence Formula:
 * Fn = Fn-1 + Fn-2
 * Base Cases:
 * F0 = 0, F1 = 1
 * Time Complexity: O(2^n) (Exponential due to repeated calculations in recursion).
 */
public class Problem_5 {

    /**
     * Recursively computes the N-th Fibonacci number.
     *
     * @param n The index of the Fibonacci sequence (0-based).
     * @return The N-th Fibonacci number.
     */
    public static int findFibonacci(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive relation: F(n) = F(n-1) + F(n-2)
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // Read an integer `n` from user input

        input.close();

        System.out.println(findFibonacci(n)); // Print the N-th Fibonacci number
    }
}