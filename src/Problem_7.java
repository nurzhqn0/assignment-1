/**
 * This program reverses an array using recursion and prints it.
 * It reads an integer `n`, followed by `n` elements, and prints them in reverse order.
 */
public class Problem_7 {

    /**
     * Recursively prints the array in reverse order.
     *
     * @param n The number of elements in the array.
     * @param arr The array containing `n` elements.
     */
    public static void reverseArray(int n, int[] arr) {
        // Base case: if n is less than or equal to 0, return
        if (n <= 0) {
            return;
        }

        // Print the last element of the current array
        System.out.print(arr[n - 1] + " ");

        // Recursive call with the next smaller part of the array
        reverseArray(n - 1, arr);
    }

    /**
     * Reads input values, stores them in an array, and prints them in reverse order.
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Read the number of elements
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the method to print the array in reverse
        reverseArray(n, arr);
        scanner.close();
    }
}
