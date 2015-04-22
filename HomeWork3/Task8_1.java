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

        getMaxfornumbers(a, b, c, d);

    }

    private static void getMaxfornumbers(int a, int b, int c, int d) {
        int max;
        if (a > b) max = a;
        else max = b;
        System.out.println("Max for 2 numbers = " + max);
        if (max < c) {
            max = c;
            System.out.println("Max for 3 numbers = " + max);
        }
        if (max < d) max = d;
        System.out.println("Max for 4 numbers = " + max);
    }
    
}
