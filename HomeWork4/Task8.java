import java.util.Arrays;
import java.util.Random;

/**
 * Created by Oleksii on 27.04.2015.
 */
public class Task8 {
    public static final int SIZE = 5;


    public static void main(String[] args) {
        int[] array = new int[SIZE];
        randomFillArray(array, -100, 100);
        System.out.println(Arrays.toString(array));
        System.out.println(isAllPositive(array));
    }

    private static boolean isAllPositive(int[] array) {
        boolean m = true;
        for (int i = 0; i < array.length; i++){
            if (array[i] <= 0) m = false;
        }
        return m;
    }

    private static void randomFillArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = min + random.nextInt(max - min + 1);
            array[i] = randomNumber;
        }
    }
}
