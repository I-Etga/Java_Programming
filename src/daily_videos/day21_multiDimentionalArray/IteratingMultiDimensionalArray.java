package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {


        int[][] array20 = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        // we can change the iteration order of both loop !!(inner and outer)
        for (int i = 0; i < array20.length; i++) {
            // System.out.println(Arrays.toString(array20[i]));

            int[] each1D = array20[i];
            for (int j = 0; j < each1D.length; j++) {
                //int eachElement = each1D[j];
                System.out.println(each1D[j]);
            }
        }
        System.out.println("-------// all elements for each loop    //----------------");

        for (int[] each1DArray : array20) {

            for (int each : each1DArray) {
                System.out.println(each);
            }
            System.out.println("--------");
        }

        System.out.println("***** all elements (reverse) for loop  **********");

        for (int i = array20.length - 1; i >= 0; i--) {
            for (int j = array20[i].length - 1; j >= 0; j--) {
                System.out.println(array20[i][j]);
            }
        }

        System.out.println("--------------------");

        for (int[] ints : array20) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}

/*

Don't forget the shortcuts:

array.for --> for -each- loop [no access to index - no reverse // fixed]
array.fori --> for  loop i++
array.forr --> for  loop(reverse) i--
 */
