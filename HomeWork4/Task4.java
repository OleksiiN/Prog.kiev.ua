import java.util.Arrays;
import java.util.Random;

/**
 * Created by Oleksii on 26.04.2015.
 */
public class Task4 {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        int[] arr;
        randomFillArray(array, 0, 100);
        System.out.println(Arrays.toString(array));
//        arr = array;
//        exchangeSortLefttoRight(arr);
//        System.out.println("Sort Left to Right: " + Arrays.toString(array));
//        arr = array;
//        exchangeSortRighttoLeft(arr);
//        System.out.println("Sort Right to Left: " + Arrays.toString(array));
        arr = array;
        exchangeSortWithFlag(arr);
        System.out.println("Sort with Flag: " + Arrays.toString(array));
    }

    private static void randomFillArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = min + random.nextInt(max - min + 1);
            array[i] = randomNumber;
        }
    }

    private static void exchangeSortLefttoRight(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int z = 1; z <= array.length - 1 - i; z++) {
                if (array[z] < array[z - 1]) {
                    int v = array[z];
                    array[z] = array[z - 1];
                    array[z - 1] = v;
                }
            }
        }
    }

    private static void exchangeSortRighttoLeft(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int z = array.length - 1 - i; z > 0; z--)
                if (array[z] < array[z - 1]) {
                    int v = array[z];
                    array[z] = array[z - 1];
                    array[z - 1] = v;
                }
        }
    }

//    Do While t
//            t = False
//    For i = 0 To UBound(Mus()) - 1
//    If Mus(i) > Mus(i + 1) Then
//    tmp = Mus(i)
//    Mus(i) = Mus(i + 1)
//    Mus(i + 1) = tmp
//            t = True
//    End If
//    Next
//            Loop


    private static void exchangeSortWithFlag(int[] array) {
        boolean Flag = false;
        do {
            Flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int v = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = v;
                    Flag = true;
                }
            }
        } while (Flag);
    }



}
