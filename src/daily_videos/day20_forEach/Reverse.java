package daily_videos.day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {


        int [] array = {1,2,3,4,5,7,8,9,10,11,12,13,14,15};

        int[] reverse = new int[array.length];

        for (int i = array.length - 1,  k=0; i >= 0; i--,k++) {
            reverse[k] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("------------");
        int[] nums = { 100,200,300,400,500};

        nums = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("------------");

        double [] db1 = {1.5,2.5,3.5};

        db1 = ArraysUtility.reverse(db1);

        System.out.println(Arrays.toString(db1));
    }
}
