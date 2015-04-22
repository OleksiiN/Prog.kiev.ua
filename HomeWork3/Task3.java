import java.util.Scanner;
/**
 * Created by Oleksii on 21.04.2015.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            for (;n>=0;n-=2)
                System.out.print(n + " ");
        } else {
            --n;
            for (;n>=0;n-=2)
                System.out.print(n + " ");
        }
        scanner.close();
    }

}

