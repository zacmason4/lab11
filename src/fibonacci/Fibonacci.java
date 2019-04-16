package fibonacci;

import java.util.Scanner;

/**
 * Fibonacci - This class contains two methods to calculate the
 * Fibonacci sequence. One is recursive and one is iterative.
 *
 * @author Zac Mason
 * @version 4/16/2019
 */
public class Fibonacci {

    /**
     * The number of additions in the recursive calculation
     */
    private static long recursiveAdd = 0;

    /**
     * The number of additions in the iterative calculation
     */
    private static long iterativeAdd = 0;

    /**
     * recursive - This method calculates the Fibonacci
     * sequence recursively. Each base case must be checked
     * before calling recursive within the method. The number
     * of additions are tracked.
     *
     * @param n The number to calculate the Fibonacci sequence to
     * @return The result of f(n)
     */
    public static int recursive(int n) {
        // check each base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // calculate with call to recursive
        else {
            recursiveAdd++; // increase the number of additions
            return recursive(n -2) + recursive(n - 1);
        }
    }

    /**
     * iterative - This method calculates the Fibonacci
     * sequence iteratively. The number of additions are tracked.
     *
     * @param n The number to calculate the Fibonacci sequence to
     * @return The result of f(n)
     */
    public static int iterative(int n) {
        // initialize integers for the base case
        int first = 0;
        int second = 1;
        int result = 0;
        // add values iteratively
        for (int i = 2; i <= n; i++) {
            result = first + second;
            iterativeAdd++;
            first = second; // adjust the values to the next integers
            second = result;
        }
        return result;
    }

    public static void main(String [] args) {
        System.out.println("Please enter a value to calculate: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int recursiveResult = recursive (n);
        int iterativeResult = iterative(n);
        System.out.println("The Fibonacci number calculated at " + n + " recursively: " + recursiveResult);
        System.out.println("The total number of recursive additions: " + recursiveAdd);
        System.out.println("The Fibonacci number calculated at " + n + " iteratively: " + iterativeResult);
        System.out.println("The total number of iterative additions: " + iterativeAdd);
    }
}
