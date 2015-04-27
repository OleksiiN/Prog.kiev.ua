

/**
 * Created by Oleksii on 26.04.2015.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{-15, 0, 10, 30};
        System.out.println(BinarySearch(array, 30));
        System.out.println(BinarySearch(array, -100));
        System.out.println(BinarySearch(array, -1));
        System.out.println(BinarySearch(array, 1));
        System.out.println(BinarySearch(array, 11));
        System.out.println(BinarySearch(array, 31));
    }

    private static int BinarySearch(int[] array, int item) {
        int mid = -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            mid = right + (left - right) / 2;
            if (item < array[mid]) right = mid - 1;
            else if (item > array[mid]) left = mid + 1;
            else return mid;
        }
        return -(left + 1);
    }
}
