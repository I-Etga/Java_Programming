package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr201 = {{1, 2}, {3, 4, 5}};
        int[][] arr202 = {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}};
        int[][] arr203 = {{15, 16, 17, 18}};

        // three dimensional array with [] [] []
        int[][][] arr3D = {{{1, 2}, {3, 4, 5}}, {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}}, {{15, 16, 17, 18}}};
        /* first index          0         |,|              1             |,|       2
           second index         0     1    |     0        1         2     |        0
         third index         0 1 2 3 4 5   , 0  1 2  3 4 5     6   7  8  ,  0  1  2   3
        */
        /*
        multidimensional Arrays contains arrays but there is a rule about it !

        single dimensional array contains elements
        (n=2)two-dimensional array contains (n-1 2-1=1) single dimensional arrays
        (n=3)three-dimensional array contains (n-1 3-1 =2)two dimensional arrays
        (n=4)four dimensional array contain (n-1 4-1=3)three dimensional arrays
         */

          /*  3d array
        first [] index of 2d array
        second [] index of 1d array
        third [] index of element*/


        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[0][1][1]);

        /*
        So basically ;
        element of array = .print(3DArray[x][y][z])
        1d array = .print(Arrays.toString(3DArray[x][y])
        2d array = .print(Arrays.deepToString(3DArray[x])
        3d array = .print(Arrays.deepToString(3DArray)
        ... for multidimensional array is the same principle in 2d and 3d arrays.
         */

        System.out.println("************");

        // print each element with nested loop(number of loops is equal number of dimension(n)!!)

        for (int i = 0; i < arr3D.length; i++) {

            System.out.println("Two dimension Array index no: " + i);
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(arr3D[i]));

            for (int j = 0; j < each2DArray.length; j++) {

                System.out.println("one dimension Array index no: " + j);
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) {

                    System.out.println("Element index no at its own array: " + k);
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }
            }
        }
    }
}
