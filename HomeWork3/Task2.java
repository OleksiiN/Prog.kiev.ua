import java.util.Scanner;

/**
 * Created by Oleksii on 21.04.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int sum = 0;
        int num = scanner.nextInt();
        while (num != 0){
            sum += num;
            num = scanner.nextInt();

        }

        System.out.println(sum);
    }

}
