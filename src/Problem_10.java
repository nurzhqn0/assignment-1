import java.util.Scanner;

/**
 * This class provides a method to compute the Greatest Common Divisor (GCD)
 * of two numbers using the Euclidean Algorithm.
 */
public class Problem_10 {

    /**
     * Computes the Greatest Common Divisor (GCD) of two integers using recursion.
     * The Euclidean Algorithm states that:
     * GCD(a, b) = GCD(b, a % b), with the base case GCD(a, 0) = a.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor of a and b.
     */
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; // Base case: If b is 0, return a
        }
        return findGCD(b, a % b);
    }

    /**
     * The main method reads two integers from user input and computes their GCD.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two integers from the user
        int a = input.nextInt(), b = input.nextInt();
        input.close();

        System.out.println(findGCD(a, b));
    }
}