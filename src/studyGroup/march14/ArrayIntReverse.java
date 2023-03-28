package studyGroup.march14;

import java.util.Arrays;

public class ArrayIntReverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversedArr = new int[array.length];

        for (int i = 0, k = reversedArr.length-1; i < array.length; i++,k--) {
            reversedArr[i] = array[k];
                    //index 0    = index4 -5
                    //index 1    = index 3 -4
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArr));
    }
}
