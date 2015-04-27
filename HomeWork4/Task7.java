import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Oleksii on 27.04.2015.
 */
public class Task7 {
    public static void main(String[] args) {
        int choice = -1;
        int size = 0;
        int nsort = 0;
        int alg = 0;
        int[] sortarr;
        int[] backsortarr;

        // check for enetered value
        System.out.println("Press \"1\" for one algorithm benchmark and \"2\" for all algorithms:");

        while (choice != 1 || choice != 2) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) break;
                else {
                    System.out.println("Please make correct choice");
                    System.out.println("Press \"1\" for one algorithm benchmark and \"2\" for all algoritms");
                }
            } else {
                System.out.println("Please make correct choice");
                System.out.println("Press \"1\" for one algorithm benchmark and \"2\" for all algoritms");
            }
        }
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("Please choose algorithm:");
            System.out.println("   Press \"1\" for algorithm \"Sort with flag\" ");
            System.out.println("   Press \"2\" for algorithm \"Select sort\" ");
            System.out.println("   Press \"3\" for algorithm \"Insert sort\" ");
            System.out.println("   Press \"4\" for algorithm \"Array sort\" ");
            alg = scanner.nextInt();

            System.out.println("Please enter SIZE of ARRAY: ");
            size = scanner.nextInt();
            System.out.println("Please enter number of sorting: ");
            nsort = scanner.nextInt();
            int[] array = new int[size];
            randomFillArray(array, -1000, 1000);
            sortarr = array;
            Arrays.sort(sortarr);
            backsortarr = sortarr;
            for (int i = 0; i < backsortarr.length / 2; i++) {
                int tmp = backsortarr[i];
                backsortarr[i] = sortarr[backsortarr.length - i - 1];
                backsortarr[backsortarr.length - i - 1] = tmp;
            }
            if (alg == 1) {
                System.out.println("Algorithm - Sort with Falg:");
                double temp = SortWithFlagTime(nsort, array);
                System.out.print("   Time for non-sort array - " + temp + ", average time - " + temp / nsort);
                temp = SortWithFlagTime(nsort, sortarr);
                System.out.print("   Time for sort array - " + temp + ", average time - " + temp / nsort);
                temp = SortWithFlagTime(nsort, backsortarr);
                System.out.print("   Time for back sort array - " + temp + ", average time - " + temp / nsort);
            }
            if (alg == 2) {
                System.out.println("Algorithm - Select sort:");
                double temp = SelectSortTime(nsort, array);
                System.out.print("   Time for non-sort array - " + temp + ", average time - " + temp / nsort);
                temp = SelectSortTime(nsort, sortarr);
                System.out.print("   Time for sort array - " + temp + ", average time - " + temp / nsort);
                temp = SelectSortTime(nsort, backsortarr);
                System.out.print("   Time for back sort array - " + temp + ", average time - " + temp / nsort);
            }
            if (alg == 3) {
                System.out.println("Algorithm - Insert sort:");
                double temp = InsertSortTime(nsort, array);
                System.out.print("   Time for non-sort array - " + temp + ", average time - " + temp / nsort);
                temp = InsertSortTime(nsort, sortarr);
                System.out.print("   Time for sort array - " + temp + ", average time - " + temp / nsort);
                temp = InsertSortTime(nsort, backsortarr);
                System.out.print("   Time for back sort array - " + temp + ", average time - " + temp / nsort);
            }
            if (alg == 4) {
                System.out.println("Algorithm - Array sort:");
                double temp = ArraySortTime(nsort, array);
                System.out.print("   Time for non-sort array - " + temp + ", average time - " + temp / nsort);
                temp = ArraySortTime(nsort, sortarr);
                System.out.print("   Time for sort array - " + temp + ", average time - " + temp / nsort);
                temp = ArraySortTime(nsort, backsortarr);
                System.out.print("   Time for back sort array - " + temp + ", average time - " + temp / nsort);

            }
        }

        if (choice == 2) {
            System.out.println("Please enter SIZE of ARRAY: ");
            size = scanner.nextInt();
            System.out.println("Please enter number of sorting: ");
            nsort = scanner.nextInt();
            int[] array = new int[size];
            randomFillArray(array, -1000, 1000);
            sortarr = array;
            Arrays.sort(sortarr);
            backsortarr = sortarr;
            for (int i = 0; i < backsortarr.length / 2; i++) {
                int tmp = backsortarr[i];
                backsortarr[i] = sortarr[backsortarr.length - i - 1];
                backsortarr[backsortarr.length - i - 1] = tmp;
            }
            System.out.println("Algorithm - Sort with Falg:");
            double temp1 = SortWithFlagTime(nsort, array);
            System.out.println("   Time for non-sort array - " + temp1 + ", average time - " + temp1 / nsort);
            double temp2 = SortWithFlagTime(nsort, sortarr);
            double min = (temp1 >= temp2 ? temp2 : temp1);
            System.out.println("   Time for sort array - " + temp2 + ", average time - " + temp2 / nsort);
            double temp3 = SortWithFlagTime(nsort, backsortarr);
            min = (temp3 >= min ? min : temp3);
            System.out.println("   Time for back sort array - " + temp3 + ", average time - " + temp3 / nsort);
            System.out.println("Best time is - " + min);

            System.out.println("Algorithm - Select sort:");
            temp1 = SelectSortTime(nsort, array);
            System.out.println("   Time for non-sort array - " + temp1 + ", average time - " + temp1 / nsort);
            temp2 = SelectSortTime(nsort, sortarr);
            min = (temp1 >= temp2 ? temp2 : temp1);
            System.out.println("   Time for sort array - " + temp2 + ", average time - " + temp2 / nsort);
            temp3 = SelectSortTime(nsort, backsortarr);
            min = (temp3 >= min ? min : temp3);
            System.out.println("   Time for back sort array - " + temp3 + ", average time - " + temp3 / nsort);
            System.out.println("Best time is - " + min);

            System.out.println("Algorithm - Insert sort:");
            temp1 = InsertSortTime(nsort, array);
            System.out.println("   Time for non-sort array - " + temp1 + ", average time - " + temp1 / nsort);
            temp2 = InsertSortTime(nsort, sortarr);
            min = (temp1 >= temp2 ? temp2 : temp1);
            System.out.println("   Time for sort array - " + temp2 + ", average time - " + temp2 / nsort);
            temp3 = InsertSortTime(nsort, backsortarr);
            min = (temp3 >= min ? min : temp3);
            System.out.println("   Time for back sort array - " + temp3 + ", average time - " + temp3 / nsort);
            System.out.println("Best time is - " + min);

            System.out.println("Algorithm - Array sort:");
            temp1 = ArraySortTime(nsort, array);
            System.out.println("   Time for non-sort array - " + temp1 + ", average time - " + temp1 / nsort);
            temp2 = ArraySortTime(nsort, sortarr);
            min = (temp1 >= temp2 ? temp2 : temp1);
            System.out.println("   Time for sort array - " + temp2 + ", average time - " + temp2 / nsort);
            temp3 = ArraySortTime(nsort, backsortarr);
            min = (temp3 >= min ? min : temp3);
            System.out.println("   Time for back sort array - " + temp3 + ", average time - " + temp3 / nsort);
            System.out.println("Best time is - " + min);
        }
    }

    private static double ArraySortTime(int nsort, int[] array) {
        int[] arr;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= nsort; i++) {
            arr = array;
            Arrays.sort(arr);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }


    private static double InsertSortTime(int nsort, int[] array) {
        int[] arr;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= nsort; i++) {
            arr = array;
            insertSort(arr);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static double SelectSortTime(int nsort, int[] array) {
        int[] arr;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= nsort; i++) {
            arr = array;
            selectSort(arr);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static double SortWithFlagTime(int nsort, int[] array) {
        int[] arr;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= nsort; i++) {
            arr = array;
            exchangeSortWithFlag(arr);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    //Array generation
    private static void randomFillArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = min + random.nextInt(max - min + 1);
            array[i] = randomNumber;
        }
    }

    // algorithm "Sort with flag"
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

    // algorithm "Select sort"
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

    // algorithm "Insert sort
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
