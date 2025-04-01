import java.util.Scanner;

/**
 * This program calculates the factorial of a given number using recursion.
 * It reads an integer `n` from the user and computes its factorial recursively.
 * Time Complexity: O(n), where `n` is the input number.
 */
public class Problem_4 {

    /**
     * Computes the factorial of a given number using recursion.
     *
     * @param n The number whose factorial is to be calculated.
     * @return The factorial of `n` as a long value.
     */
    public static long findFactorial(int n) {
        // Base case: factorial of 1 is 1
        if (n == 1) {
            return 1L;
        }
        // Recursive case: n! = n * (n-1)!
        return (long) n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // Read an integer from user input

        input.close();

        System.out.println(findFactorial(n)); // Print the factorial of `n`
    }
}