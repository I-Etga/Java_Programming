package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 60, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};

        // multi-dimensional array = it's a container for the arrays!!

        // format: [][] says it's multi dimensional array!(that's the difference)

        // declare and assing at the same time (we can store as many as array we want !!)
        int[][] arr20 = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}, arr4}; // I can store a single dimensional array with its reference/variable name !!
        // index:           0               1               2        3
        System.out.println(arr20.length); // 4

        // but if we just declare/create an array without element
        //  ,we have to decide number of array which is fixed.

        int[][] arr30 = new int[3][];//(We can store 3 arrays in this multi-dimensional array )


        System.out.println(Arrays.toString(arr20[1]));

        /*
        Can you see the difference ? That's a really important difference !!

          If I only ise one brackets I'll get an array. So arr20[1] returns an array.

          But if I use both of them brackets and enter indexes I'll get  the element at given index from the array at given index.

          Briefly , We can see in the first case we have use " .println(Arrays.toString(arr20[1])) " to print array.
                    But in second case we can print the element just like that ".println(arr20[1][2]) "


                    It's similar when we want to print whole array and only one element of array !!

                    .println(Arrays.toString(array)) // .println(array[3])

         */

        System.out.println(arr20[1][2]);


    }
}
