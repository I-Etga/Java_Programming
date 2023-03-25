package daily_videos.day19_Arrays.tasks;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0, 6, 12, 0, 0, 45, 23, 0, 43};

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
