import java.util.Scanner;
/**
 * Created by Oleksii on 21.04.2015.
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your surname: ");
        String surname = scanner.next();
        System.out.print("Enter your age: ");

       if (scanner.hasNextInt()) {
           int age = scanner.nextInt();
           if (age >= 0 && age < 120) {
               System.out.println("I\'m " + name + " "+ surname +", " + age + " years old");
           } else System.out.print("Illegal age");
       } else System.out.print("Illegal age");

        scanner.close();
        }
}
