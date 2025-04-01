import java.util.Scanner;

/**
 * This program checks whether a given string consists only of digits using recursion.
 */
public class Problem_8 {

    /**
     * Recursively checks if a string consists only of digits.
     *
     * @param s The input string.
     * @param index The current index to check.
     * @return true if the string consists only of digits, false otherwise.
     */
    public static boolean isAllSandar(String s, int index) {
        // Base case: If we checked all characters, return true
        if (index == s.length()) {
            return true;
        }

        // If the current character is not a digit, return false
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }

        return isAllSandar(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // Read input string
        scanner.close();

        // Call recursive function
        boolean result = isAllSandar(s, 0);

        System.out.println(result ? "Yes" : "No");
    }
}