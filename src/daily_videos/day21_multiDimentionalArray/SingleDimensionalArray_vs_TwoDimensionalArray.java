package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {

        int [] arr1D = new int[10];
        // I get 10 0 zeros. Because default value of int is '0'zero.
        System.out.println(Arrays.toString(arr1D));

        int[] arr1Db = {1,2,3,4,5};
        int[] arr1Dc = {6,7,8};
        int[] arr1Dd = {9,10};
        int[] arr1De = {11,12,13,14,15};
        int[] arr1Df = {16,17,18,19,20,21};
        int[] arr1Dg = {22,23,24,25};

        int[][] arr2D = new int[5][]; // size is the first bracket. So use the first one.
                        // index 0 ~ 4 (fixed)

        arr2D[2] = arr1D; // now the array which is at index 2 is 10 zeros array!!

        arr2D[0] = arr1Db;
        arr2D[1] = arr1Dc;
        arr2D[2] = arr1Dd;
        arr2D[3] = arr1De;
        arr2D[4] = arr1Df;

        // arr2D[5] = arr1Dg; -- I'll get exception. Because length of arrays is FIXED.

        System.out.println(Arrays.deepToString(arr2D));
        // I get 5 null . Because arrays are objects and default value of object is null !!



    }
}
