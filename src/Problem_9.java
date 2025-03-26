import java.util.Scanner;

/**
 * This class provides a method to compute the binomial coefficient C(n, k)
 * using recursion, based on Pascal's triangle property.
 */
public class Problem_9 {

    /**
     * Computes the binomial coefficient C(n, k) using recursion.
     * The binomial coefficient represents the number of ways to choose
     * k elements from a set of n elements, calculated as:
     * C(n, k) = C(n-1, k-1) + C(n-1, k)
     * with base cases:
     * C(n, 0) = 1 and C(n, n) = 1.
     *
     * @param n The total number of elements.
     * @param k The number of selected elements.
     * @return The computed binomial coefficient.
     */
    public static long findBinomCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1L;
        }
        return findBinomCoef(n - 1, k - 1) + findBinomCoef(n - 1, k);
    }

    /**
     * The main method reads input values for n and k, and computes the binomial coefficient.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two integers n and k from the user
        int n = input.nextInt(), k = input.nextInt();
        input.close();

        System.out.println(findBinomCoef(n, k));
    }
}