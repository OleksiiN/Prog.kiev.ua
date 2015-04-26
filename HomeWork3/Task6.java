import java.util.Scanner;

/**
 * Created by Oleksii on 25.04.2015.
 * The list of functions (statistical methods) without use of any java libraries
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(sum(scanner.nextInt(),scanner.nextInt()));
        System.out.println(isPower(scanner.nextInt(), scanner.nextInt()));
    }

    /**
     * Returns the sum of a two integer values
     *
     * @param a the value to sum
     * @param b the value to sum
     * @return the result
     * @throws ArithmeticException if the result overflows a integer
     */
    private static int sum(int a, int b) {
        if ((a / 2 + b / 2) >= Integer.MAX_VALUE / 2 || (a / 2 + b / 2) <= Integer.MIN_VALUE / 2) return 0;
        else return a + b;
    }

    /**
     * Return absolute value for integer number
     *
     * @param a the value to absolute
     * @return the result
     */
    protected static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    /**
     * Returns if a value positive, negative or is 0
     *
     * @param a the value to determinate
     * @return o if  @param = 0; -1 if @param negative number; 1 if @param is positive number
     */

    private static int signum(int a) {
        if (a > 0) return 1;
        else if (a < 0) return -1;
        else return 0;
    }

    /**
     * Show if a value is a even number or not
     *
     * @param a integer value to analyze
     * @return true if value is even; false if value is not even
     */
    private static boolean isEven(int a) {
        return a % 2 == 0;
    }

    /**
     * Show if a value is a odd number or not
     *
     * @param a integer value to analyze
     * @return true if value is odd; false if value is not odd
     */
    private static boolean isOdd(int a) {
        return a % 2 != 0; // or isEven (a) == false ?
    }

    /**
     * Show if a value is prime or not
     *
     * @param a integer value to analyze
     * @return true if number is prime; false if number not prime
     */
    private static boolean isPrime(int a) {
        boolean z = false;
        if (a <= 1) return false;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) z = false;
            else z = true;
        }
        return z;
    }


    /**
     * Shows the result of a number raised to a power
     *
     * @param base     integer value that will be raised
     * @param exponent the degree that raise the @param base
     * @return the result
     */
    private static int pow(int base, int exponent) {
        int result = 1;
        if (exponent == 0) return 1;
        else if (exponent < 0) return 0;
        else {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
                if (result >= Integer.MAX_VALUE) {
                    result = 0;
                    break;
                }
            }
            return result;
        }
    }

    /**
     * Return logarithm to the base of
     *
     * @param power - the integer value of which take the logarithm
     * @param base  - the integer base of logarithm
     * @return the result
     */
    private static int isPower(int power, int base) {
        int result = 1;
        int i = 0;
        if (power <= base) {
            while (result != power) {
                result = result * base;
                i++;

            }
        } else return -1;

        return i;
    }


}
