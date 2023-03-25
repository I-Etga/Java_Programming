package daily_videos.day19_Arrays.tasks;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntReverse {

    public static void main(String[] args) {

        int[] arrays = {1,2,3,4,5};
                        //I have already created a custom method !!
        int[] reverse = ArraysUtility.reverse(arrays);

        System.out.println(Arrays.toString(reverse));
    }


}

