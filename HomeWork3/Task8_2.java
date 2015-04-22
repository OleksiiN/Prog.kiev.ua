import java.util.Scanner;
/**
 * Created by Oleksii on 22.04.2015.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        int d = scanner.nextInt();

        System.out.println("Max for 2 numbers = " + getMaxfor2numbers(a, b));
        System.out.println("Max for 3 numbers = " + getMaxfor3numbers(a, b, c));
        System.out.println("Max for 3 numbers = " + getMaxfor4numbers(a, b, c, d));

    }

    private static int getMaxfor2numbers(int a, int b) {
        return (a > b ? a : b);
    }

    private static int getMaxfor3numbers(int a, int b, int c) {
        return (getMaxfor2numbers(a, b) > c ? getMaxfor2numbers(a, b) : c);
    }

    private static int getMaxfor4numbers(int a, int b, int c, int d) {
        return (getMaxfor3numbers(a, b, c) > d ? getMaxfor3numbers(a, b, c) : d);
    }
}