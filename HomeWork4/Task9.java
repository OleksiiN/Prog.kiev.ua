import java.util.Arrays;
import java.util.Random;

/**
 * Created by Oleksii on 27.04.2015.
 */
public class Task9 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[random.nextInt(5)];
        int[] array2 = new int[random.nextInt(5)];
        randomFillArray(array1, -100, 100);
        randomFillArray(array2, -100, 100);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println(Arrays.toString(merge(array1, array2)));

    }

    private static void randomFillArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = min + random.nextInt(max - min + 1);
            array[i] = randomNumber;
        }
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int i = 0;
        for (int z = 0; z < array1.length; z++) {
            array[z] = array1[z];
            i++;
        }
        for (int z = 0; z < array2.length; z++) {
            array[i] = array2[z];
            i++;
        }
        return array;
    }

}