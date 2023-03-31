package daily_videos.day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ArrayListConversion {
    public static void main(String[] args) {


        String[] arr = {"A","B","C","D"};
                                // we can't directly pass array in the parantheses.
                                // Because array is not collection !!
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);


        System.out.println("*****   arrayList.toArray(new String[size])      ****");
        /*     Array vs ArrayList:
        What's the advantage of array over collection !
        + it supports both non-primitives and primitives
        + It can be multi-dimensional.
        + It has the fastest performance

        disadvantages :
        - size of array fixed. -->in order to use an array size must be given in advance.
        - has a few of methods ! not enough (remove X , add X ... )

        collection' advantages:
        + size is dynamic. You can increase and decrease whenever you want
        + It has a lot of ready method !

        collection' disadvantages:
        - it supports only non-primitives
        - it can not be multi-dimensional
        - It's not as fast as arrays.
         */


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));

        String [] languages = list2.toArray(new String [10]); // ["Java","Python","C#",null,null,null,null,null,null,]

        // !!if we pass a size less than length of arrayList, the size of array will be the length of arrayList !!
        String [] languages2 = list2.toArray(new String[2]);

        System.out.println(Arrays.toString(languages)); // [Java, Python, C#, null, null, null, null, null, null, null]
        System.out.println(Arrays.toString(languages2)); //[Java, Python, C#]

        System.out.println("----------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));


        Integer [] numbers = nums.toArray(new Integer[2]);

       // int [] numbers = nums.toArray(new Integer[2]); - we get compiler error.!! BECAUSE COLLECTION DOES NOT ACCEPT PRIMITIVES




    }
}
