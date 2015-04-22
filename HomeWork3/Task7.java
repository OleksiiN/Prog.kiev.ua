
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
       // System.out.println("Average = " + (int) average(n1, n2));
    }

//    private static int average(int n1, int n2) {
//        long sum = n1+n2;
//        return (int)(sum/2);
//    }
    private static void average(int n1, int n2) {
        double sum = (n1/10 + n2/10);
        int average = (int) (sum*10/2);
        System.out.println("Average = " + average);

    }
}
