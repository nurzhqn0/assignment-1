import java.util.Scanner;

/**
 * This program checks whether a given number is prime or composite.
 * It reads an integer `n` from the user and determines if it is a prime number.
 * Time Complexity: O(√n), where `n` is the input number.
 */

public class Problem_3 {
    /**
     * Checks if a given number is prime.
     *
     * @param n The number to check for primality.
     * @return true if the number is prime, false if it is composite.
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false; // Numbers less than 2 are not prime

        // Loop from 2 to sqrt(n) and check for divisibility
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // If divisible, it's not prime
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // Read an integer from user input

        // Check if `n` is prime and print the result
        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        input.close();
    }
}