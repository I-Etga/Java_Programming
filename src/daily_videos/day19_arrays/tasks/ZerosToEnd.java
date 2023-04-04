package daily_videos.day19_arrays.tasks;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0, 6, 12, 0, 0, 45, 23, 0, 43};

        // i0 k13 j0

        int[] arrayEndZeros = new int[array.length];

        for (int i = 0, k = array.length - 1, j = 0; i < array.length; i++) {
            if (array[i] == 0) {
                arrayEndZeros[k] = array[i];
                k--;
            } else {
                arrayEndZeros[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrayEndZeros));

        System.out.println("------ #2 approach -----------");

        int[] array1 = {10, 0, 5, 0, 1, 0};
        //Arrays.sort(array1);

        int[] result = new int[array1.length];
        System.out.println(Arrays.toString(result));
        int j = 0;

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != 0) {
                result[j++] = array1[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }


}

/*
7. write a program that can move all the zeros to the end of the
array
Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */
