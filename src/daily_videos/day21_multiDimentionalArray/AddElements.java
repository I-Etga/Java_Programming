package daily_videos.day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        //expected result {1,2,3,4,5,6}

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element; // basically assignment
        System.out.println(Arrays.toString(newArray));


        System.out.println("--------------------");

        int[] numbers = {100, 90, 80, 70, 60};

        //ArraysUtility.addElement(numbers,50);

        numbers = ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------");

        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5); // adds an element and I re-assign

        nums = ArraysUtility.addElement(nums, 6.5);  // adds another element and I re-assign

        nums = ArraysUtility.addElement(nums, 7.5); // adds an element and I re-assign

        System.out.println(Arrays.toString(nums));
        /* It does NOT CHANGE the size of nums array.
        Instead, it creates a new array , copy the nums and add the element given.
        And finally  I re-assign the original array with the new array(includes new element). ==>  nums = ArraysUtility.addElement(nums...)
         */

        System.out.println("--------------------");

        String[] students = {"Yasin", "Sumeye", "Ermek" };

        students = ArraysUtility.addElement(students, "Umran");
        students = ArraysUtility.addElement(students, "Abodullah");
        students = ArraysUtility.addElement(students, "Raif");

        System.out.println(Arrays.toString(students));

        System.out.println("--------------------");

        char[] characters = {'a', 'n', 'k', 'a', 'r'};

        characters = ArraysUtility.addElement(characters, 'a');

        System.out.println(ArraysUtility.contains(array, 4));//true
        System.out.println(ArraysUtility.contains(array, 72));//false

        System.out.println(ArraysUtility.contains(students, "Raif")); //true
        System.out.println(ArraysUtility.contains(students, "Remzi")); // false

        System.out.println(ArraysUtility.contains(nums, 5.5)); // true
        System.out.println(ArraysUtility.contains(nums, 25.5)); // false

        System.out.println(ArraysUtility.contains(characters, 'a')); //true
        System.out.println(ArraysUtility.contains(characters, 'z')); // false


    }
}
