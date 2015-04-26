import java.util.Arrays;
import java.util.Random;

/**
 * Created by Oleksii on 26.04.2015.
 */
public class Task5 {
    public static final int SIZE = 10;


    public static void main(String[] args) {
        int[] array = new int[SIZE];
        randomFillArray(array, 0, 100);
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void randomFillArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = min + random.nextInt(max - min + 1);
            array[i] = randomNumber;
        }
    }

    private static void selectSort(int[] array) {
        int v = 0;
        int v1;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int z = i; z < array.length; z++) {
                if (min > array[z]) {
                    min = array[z];
                    v = z;
                }
            }
            v1 = array[i];
            array[i] = array[v];
            array[v] = v1;
        }
    }


}
