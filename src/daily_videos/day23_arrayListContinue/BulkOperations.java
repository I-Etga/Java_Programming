package daily_videos.day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // start to add from index and other elements will be shifted to left.
        list1.addAll(1, numbers);// [[1, 10, 20, 30, 40, 2, 3]]

        System.out.println(list1);


        System.out.println("********[Arrays.] asList() method *********");
        // that method gives us a list from our element (array method )

        ArrayList<Integer> scores = new ArrayList<>();

        //scores.addAll(75, 85, 95, 70, 80) // this is illegal. (it only takes one argument and must be a collection)
        scores.addAll(Arrays.asList(75, 85, 95, 70, 80)); // it only demands one argument(we should pass a collection)

        System.out.println(scores);

        /*
        bulk operation methods ACCEPTS ONLY COLLECTION.
        addAll() , removeAll(),contaionsAll(), retainAll()
         */


        System.out.println("**********");

        ArrayList<String> students = new ArrayList<>();
        //students.addAll("Ross","Rachel", "Barney", "Ted" ,"Robin"); -
        // those 5 argument I have pass one argument! So they have to be converted to collection type.

        students.addAll(Arrays.asList("Ross", "Rachel", "Barney", "Ted", "Robin"));

        System.out.println(students);// prints [Ross, Rachel, Barney, Ted, Robin]

        // addAll() method is overloaded method. so we have another option(index , collection)

        students.addAll(2, Arrays.asList("Joey", "Monica"));
        /* it does not remove anything.
         It adds the elements starting from given index and other elements* are shifted to left[index++].
         The index of elements which come before given index(as argument) , does not change !!

         Let's see what's happened above :
        students.addAll(2, Arrays.asList("Joey", "Monica"));
                       it adds starting given index 2
                    0       1         2        3       4
        student = ["Ross", "Rachel", "Barney", "Ted", "Robin"]
        students.addAll(2, Arrays.asList("Joey", "Monica"))
                  (same)0     (same)1   (new) 2     (new) 3   (shifted)4     index[++] 5    index[++]6
        student = [Ross,       Rachel,      Joey,      Monica,   Barney,     Ted,            Robin]
         */

        System.out.println(students);


        System.out.println("************");

        /*
        If the data type is NOT non-primitive , it cant be converted to collection.
         Collection does NOT support PRIMITIVES.
         */

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); // that's the second way to create arrayList

        /*  l1.addAll(Arrays.asList(nums));
         nums[] is an array. ARRAY is NOT collection type. ARRAYLIST IS a collection type.
         Bulk operation methods and new ArrayList<> -->(Arrays.asList(nums))<-- accepts only collection.
         So we use array method Arrays.asList(array) and it returns arraylist !!*/

        /*
         if the array we have is a primitive array, we have to first convert it to wrapper class object.
                          primitive -->  int[] numbers ;     non-primitive-->  Integer[] numbers;
         Because ArrayList type <int>X   <Integer>√    can NOT be primitive type !!

         int [] numbers = {.....};
         Arrays.asList(numbers) // we get compiler error. !! ()
        */
        System.out.println(l1);


        System.out.println("***** .containsAll(-collection-/ Array.asList()) ******");

        ArrayList<String> employeeList = new ArrayList<>();

        employeeList.addAll(Arrays.asList("Barney", "Rachel", "Ross", "Amy"));

        System.out.println(employeeList);

        boolean hasAlena = employeeList.contains("Alena");
        boolean hasAmy = employeeList.contains("Amy");// it checks only one element


        System.out.println(hasAlena); //false
        System.out.println(hasAmy); // true

        // But I want to check not just one element , I want more !!

        boolean hasRossAmy = employeeList.containsAll(Arrays.asList("Ross", "Amy"));
        boolean hasRossAmyEtga = employeeList.containsAll(Arrays.asList("Ross", "Amy", "Etga"));

        /*
        containsAll(-collection-) , ORDER does not matter !! not order-sensitive
         As long as the arraylist contains the specified arguments in method , returns true

         All arguments must be contained to get true.(we can think && operator)
        */
        System.out.println(hasRossAmy); // true
        System.out.println(hasRossAmyEtga); // false

        System.out.println("*************");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 60, 70, 80, 10, 20, 20, 10));

        list.remove(10); // I have to option. pass an index or object . It removes only one element

        System.out.println(list); // [10, 20, 30, 40, 60, 70, 80, 10, 20, 20]

        list.removeAll(Arrays.asList(10, 20)); // it removes all 10s and 20s (which arguments I pass)!!

        System.out.println(list); // [30, 40, 60, 70, 80]

        System.out.println("***** retainAll()  -->opposite of removeAll()     *****");
                                                        //#1 the first way to add elements !!
        ArrayList<String> developers = new ArrayList<>(Arrays.asList("Ross", "Rachel","Ross", "Barney", "Ted", "Robin", "Robin", "Amy"));


        // #2 the second way to add elements
        //developers.addAll(Arrays.asList("Ross", "Rachel", "Barney", "Ted", "Robin","Robin","Ross","Amy"));


        developers.retainAll(Arrays.asList("Ross", "Rachel"));
        //keeps the given arguments and remove rest of them !!
        // In other word it removes all the un-matching elements
        System.out.println(developers); // [Ross, Rachel, Ross]

        System.out.println("***********");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs","Patato","Milk","Tomato","Rice","Orange","Strawberry", "Blueberry","Paper Towels"));

        // two ways to remove elements: #1 removeAll(): removes all matching elements and #2 retainAll() : removes all un-matching elements

        groceriesList.retainAll(Arrays.asList("Eggs","Patato","Milk","Tomato","Rice"));
        // keeps the passed argument and removes rest of them

        //groceriesList.removeAll(Arrays.asList("Orange","Strawberry", "Blueberry","Paper Towels")); // results are identical


        System.out.println(groceriesList);

    }

}
