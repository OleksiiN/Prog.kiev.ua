import java.util.Scanner;

/**
 * Created by Oleksii on 26.04.2015.
 * Task 1* (MinMaxSearch)
 * Write functions (statistical methods) that will
 * find minimal and maximum value in array of integer
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(searchMin(new int[]{10, 0, -15, 30}));
        System.out.println(searchMax(new int[]{10, 0, -15, 30}));
    }

    /**
     * Return minimum value fot integer array
     * @param array initiated integer array
     * @return the result
     */
    private static int searchMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    /**
     * Return maximum value fot integer array
     * @param array initiated integer array
     * @return the result
     */
    private static int searchMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }


}
