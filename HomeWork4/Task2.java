/**
 * Created by Oleksii on 26.04.2015.
 * Task 2* (LinearSearch)
 * Write functions (statistical methods) that will
 * find value in array of integer with help of linear search
 * (full search)
 *
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{10, 0, -15, 30}, -15));
        System.out.println(linearSearch(new int[]{10, 0, -15, 30}, 100));
    }

    /**
     * Show number of element that matches @param item
     * @param array integer array
     * @param item value that need to find
     * @return the number of element in array if find; return -1 if didn't find
     */
    private static int linearSearch(int[] array, int item) {
        int s = -1;
        for (int i = 0; i < array.length; i++) {
            if (item == array[i]) s = i;
        }
        return s;
    }


}
