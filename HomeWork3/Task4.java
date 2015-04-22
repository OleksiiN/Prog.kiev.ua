import java.util.Scanner;
/**
 * Created by Oleksii on 21.04.2015.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            for (int d=1; d<=n; d++) {
                System.out.print(i*d + "\t");
            }
        }
        scanner.close();
    }
}
