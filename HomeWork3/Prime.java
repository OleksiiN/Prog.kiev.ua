/**
 * Created by Oleksii on 27.04.2015.
 */
public class Prime {
    public static void main(String[] args) {
        for (int i = 0; i<1000; i++) {
            if (isPrime(i) == true)
            System.out.println(i+": "+isPrime(i));
        }
    }

    private static boolean isPrime(int a) {
        boolean z = false;
        if (a <= 1) return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                z = false;
                break;
            } else z = true;
        }
        return z;
    }
}