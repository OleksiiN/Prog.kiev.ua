import java.util.Scanner;
/**
 * Created by Oleksii on 21.04.2015.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        //1
        System.out.println("1.");
        for (int i=1; i<=n; i++) {
            for (int d = 1; d<=i; d++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //2
        System.out.println("2.");
        for (int i=1; i<=n; i++) {
            for (int d = 1; d<=i; d++) {
                System.out.print(d + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //3
        System.out.println("3.");
        int z=n;
        for (int i = 1; i<=n; z--, i++){
            for (int d = 1; d<=z;  d++){
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //4
        System.out.println("4.");
        for (int i=1; i<=n; n--) {
            for (int d = 1; d<=n; d++) {
                System.out.print(d + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
