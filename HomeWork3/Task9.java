import java.util.Scanner;
/**
 * Created by Oleksii on 22.04.2015.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int fibo = 0;
        if (n > 0) {
            for (int i =0; i<=n; i++) {
                fibo = getFibo(i);
            }
        }
        else {
            for (int i =1; i<=Math.abs(n); i++) {
                fibo = (int)Math.pow(-1, i+1)*getFibo(i);
            }
        }

        System.out.println(fibo);
    }

    private static int getFibo(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == -1) {
            return 1;
        }
        else {
            return getFibo(n-1) + getFibo(n-2);
        }
    }
}
