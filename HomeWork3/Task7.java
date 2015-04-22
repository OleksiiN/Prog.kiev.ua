
import java.util.Scanner;
/**
 * Created by Oleksii on 22.04.2015.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        average(n1, n2);
    }

    private static void average(int n1, int n2) {
        long sum = (long)n1+(long)n2;
        long average = (sum)/2;
        System.out.println("Average = " + average);
    }
}
