import java.util.Random;
import java.util.Scanner;

/**
 * Created by Oleksii on 22.04.2015.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        String exit;
        do {
            int a = 0;
            int b = 100;
            int x = rnd.nextInt(100);
            int z = -8;
           // System.out.println(x);

                while(z != x){
                    System.out.print("Input number in the range [" + a + ", " + b + "]: ");
                    boolean check=scanner.hasNextInt();
                    if(check && ( z = scanner.nextInt()) >= a && z <= b){
                        if(z < x) a = z + 1;
                        else b = z - 1;
                    }
                    else if(!check){scanner.next(); System.out.println("Please enter correct number");
                    }
                    else {System.out.print("Please be attentive, ");}
                }

                System.out.println("YOU WIN!!!");
                System.out.print("Continue? (yes/no): ");
                exit = scanner.next();
                while (!exit.equals("no") && !exit.equals("yes")) {
                    System.out.println("Please make correct choice");
                    System.out.print("Continue? (yes/no): ");
                    exit = scanner.next();
                    System.out.println(exit);
                }

            } while (exit.equals("yes"));

            System.out.println("Thank you for playing!!!");
        scanner.close();
        }
}
