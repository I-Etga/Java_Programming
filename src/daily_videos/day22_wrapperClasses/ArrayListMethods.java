package daily_videos.day22_wrapperClasses;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        list.add(10); // primitive to Integer Wrapper Class . So it's autoboxing.
        list.add(20);
        list.add(30); // every add method increases the size of arraylist.
        list.add(10); // ArrayList accepts duplicate elements.

        //list.add(5.5); // Why I'm getting compiler error right now ? It's must be match arranged data type of ArrayList !!

        list.add(1,15); // there are two types add method. If you enter  index number and element, method insert that element at that index !!
        list.add(2,25); // insert means that does not change the original element at that index , they just shift it to the right !!

        System.out.println(list);

        list.get(2); // returns Integer


        System.out.println("----------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Barney");
        studentsList.add("Rachel");
        studentsList.add("Ross");
        studentsList.add("Amy");

        System.out.println(studentsList.size()); // prints the size of arraylist
        System.out.println(studentsList); // prints the array

        String firstStudent = studentsList.get(0); // returns a String !! // return data type depends on the Arraylist's <data type>

        System.out.println(firstStudent);

        studentsList.get(studentsList.size()-1); // It's going to return the elements which is at the last index

    }
}
