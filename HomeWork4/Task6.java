import java.util.Arrays;
import java.util.Random;

/**
 * Created by Oleksii on 26.04.2015.
 */
public class Task6 {
    public static final int SIZE = 10;
    
    public static void main(String[] args) {
        int[] array = new int[SIZE];
        randomFillArray(array, 0, 100);
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void randomFillArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = min + random.nextInt(max - min + 1);
            array[i] = randomNumber;
        }
    }

    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int z = i; z > 0 && array[z - 1] > array[z]; z--) {
                int v = array[z - 1];
                array[z - 1] = array[z];
                array[z] = v;
            }
        }
    }


}
