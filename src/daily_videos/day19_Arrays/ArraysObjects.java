package daily_videos.day19_Arrays;

import java.util.Arrays;

public class ArraysObjects {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        // one object and there access !!

        arr1[1] = 3000;
        arr2[2] = 3000; // What will happen now ?

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        /*
        arr1 [10, 3000, 3000, 40, 50]
        arr2 [10, 3000, 3000, 40, 50]
        arr3 [10, 3000, 3000, 40, 50]
        As you can see if I change an element, that affects all of them.
        Because there is ONLY ONE OBJECT.
         */





    }
}
