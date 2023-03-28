package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice3 {
    public static void main(String[] args) {
        int[][][] arr3D1 = {{{1, 2}, {3, 4, 5}}, {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}}, {{15, 16, 17, 18}}};
        int[][][] arr3D2 = {{{1, 2}, {3, 4, 5}}, {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}}, {{15, 16, 17, 18}}};
        int[][][] arr3D3 = {{{1, 2}, {3, 4, 5}}, {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}}, {{15, 16, 17, 18}}};


        int[][][][] arr4D = {arr3D1, arr3D2, arr3D3};


        for (int[][][] ints3D : arr4D) {
            //System.out.println(Arrays.deepToString(ints3D));
            for (int[][] anInt2D : ints3D) {
                //System.out.println(Arrays.deepToString(anInt2D));
                for (int[] ints1D : anInt2D) {
                    //System.out.println(Arrays.toString(ints1D));
                    for (int i : ints1D) {
                        System.out.println(i); // to get the elements, I only need that print statement.
                        // the other print statements given above are just showing how it works
                    }

                }
            }

        }
    }
}
