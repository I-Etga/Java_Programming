package daily_videos.day19_arrays;

import java.util.Arrays;

public class ArraysLiteral {

    public static void main(String[] args) {


        int [] numbers = new int[5];

        int[] nums = {10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));


        System.out.println("-----------");


       // String[] days = new String[7];

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        /*
                   What happens in the background ?

                   days = new String[7]
                   days[0] = "Monday";
                   ... until the last element days[6] = "Sunday";
         */

        int n = 1 ;

        System.out.println(days[n-1]);

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
