import java.util.Scanner;

/**
 * Time Complexity: O(n), where `n` is the input number.
 */
public class Problem_6 {
    /**
     * Recursively calculates a^n (a raised to the power of n).
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    public static long findDarege(int a, int n){
        // Base case: any number to the power of 0 is 1
        if(n == 0){
            return 1L;
        }
        // Recursive case: multiply 'a' with the result of findDarege(a, n-1)
        return a * findDarege(a, n - 1);
    }

    /**
     * Reads input values and computes a^n using recursion.
     * Prints the computed power to the console.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read base (a) and exponent (n) from user
        int a = input.nextInt(), n = input.nextInt();

        input.close();
        System.out.println(findDarege(a, n));
    }
}
