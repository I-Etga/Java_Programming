package daily_videos.day22_wrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListIntro {

    public static void main(String[] args) {

        int[] array = new int[5];//{0,0,0,0,0} elements are default value until I assign .
        array[0] = 10; //{10,0,0,0,0}
        array[1] = 20;// {10,20,0,0,0}
        // we've created only one array. We're just updating the elements of array.

        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        //array[5] = 60 --> we get compiler error!! indexOutOfBoundException

        /*
         this is the disadvantage of array : size is fixed.
         But supports both primitive and non-primitive variables.

        Don't be confused !!
        We created two different custom method named remove and add element in Array.
        But we CAN'T change the size of array with these methods.
        Method creates a NEW array, and  ASSIGNS updated elements (increased or decreased elements) to new array!!

        Other data structure supports ONLY NON-primitives !!

         */

        System.out.println(Arrays.toString(array));

        System.out.println("----------");

        ArrayList<Integer> list = new ArrayList<>();
        // specify data type is optional
        /*
        If we specify a data type in second <> , it has to be same with the first one.
        So it's already optional. We better enter nothing to ignore compiler error.
        
         */
    }
}
