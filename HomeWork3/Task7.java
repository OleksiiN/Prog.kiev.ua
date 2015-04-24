import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Average = " + average(n1, n2));
        
        scanner.close();
     }

    private static int average(int n1, int n2) {
       return (n1/2+n2/2) + (n1 % 2 + n2 % 2)/2;

    }
}
