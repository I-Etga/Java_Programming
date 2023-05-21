package daily_videos.day41_maps;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        // It's list of list ' >> '. But, it's not multi dimensional list.
        List<List<Integer>> lists = new ArrayList<>(); //[This list accepts only Integer Lists !!]
        List<Set<Integer>> listOfSets1 = new ArrayList<>();//[This list accepts only Integer Sets !!]
        List<Queue<Integer>> listOfQueue = new ArrayList<>();//[This list accepts only Integer Queue !!]
        List<int[]> listOfArray = new ArrayList<>(); //[This list accepts only int Arrays !!]
        //[Array can contain primitives and non-primitives, but it's NON-primitive !!]


        // I could give in <>here any non-primitives! (even my custom Classes )
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));


        // lists.addAll( Arrays.asList(list1, list2));
        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);

        //10
        System.out.println(lists.get(1).get(3));

        //If I want to remove an element/elements of List/Collection, I have to use Iterator !!

        for (List<Integer> eachList : lists) {
            //same principle as getting element of multi dimensional Arrays !!
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }


        System.out.println("***** ***** ");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        // I could have used HashSet, but it does not keep order !! So the order matters to us, we use LinkedHashSet !!
        listOfSets.add(new LinkedHashSet<>());  // 0
        listOfSets.add(new LinkedHashSet<>());  // 1
        listOfSets.add(new LinkedHashSet<>());  // 2
        listOfSets.add(new LinkedHashSet<>());  // 3

        System.out.println(listOfSets); // [[], [], [], []] --> it contains 4 empty sets

        // {10, 5, 20}

        //Every single object of ListOfSets is an Integer Set.[listOfSets.get(0).(methods of Collection)]
        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20)); // [10, 5, 20] Set--> no duplicates !!
        listOfSets.get(1).addAll(Arrays.asList(30, 15, 30));
        listOfSets.get(2).addAll(Arrays.asList(300, 150, 40));
        listOfSets.get(3).addAll(Arrays.asList(30000, 1, 5));

        System.out.println(listOfSets); // [[10, 5, 20], [30, 15], [300, 150, 40], [30000, 1, 5]]


        System.out.println("***** *****");
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        //System.out.println(listOfArrays); // [[I@4a574795, [I@f6f4d33]

        // How can I change an element of an Array of ListOfArray ?
        listOfArrays.get(0)[2] = 35; // listOfArrays.get(0)--> is an Array, and we can get element of Array with '[index]'

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("***** *****");

        //  List<List<Employee>>  teams = new ArrayList<>();


        // List<int[][]>  l = new ArrayList<>();


    }

}
