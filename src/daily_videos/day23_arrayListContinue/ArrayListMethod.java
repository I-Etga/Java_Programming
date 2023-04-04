package daily_videos.day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {
    public static void main(String[] args) {


        int array[] = {1, 2, 3, 4, 5};

        array[0] = 100; // this is how we update of a value in array
        // We can't use it updating value of arraylist. We have to use ArrayList Method definitely.!

        System.out.println(Arrays.toString(array));

        System.out.println("********  set(index , element) method **********");


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);
        // in order to print arrayList we don't need toString method !! It's called implicitly

        //groceriesList[1] = "Pineapple";  this is illegal !! this does not work in arrayList.(works in array)

        // set() method updates a value of arrayList. (based on index number)

        groceriesList.set(2, "Pineapples");// "Apples" is gone , and "Pineapples" has replaced it(basically update)!

        System.out.println(groceriesList);

        /*
                what is the difference between add(index,element) and set(index,element) ??
                    add(index,element): shifted the elements which come after entered index(element at that index included) to right !!
                    So that method does not remove or update any element of arraylist. It adds an elements and change the order.
                    Also, it increases the size of arraylist.

                    But set(index, element) method updates(changes/reassign) the element at entered index.
                    size of arraylist does not change.
        */

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        System.out.println("*****  remove method (int(index))*******");

        // there are two types of remove method. #1 through index number #2 through objects itself
        groceriesList.remove(0); // #1 (passing int (index number))
        groceriesList.remove("Cooking oil"); //#2 (passing obj(for ex: String " "))

        System.out.println(groceriesList); // removes the element and shifted other elements(come after given index) to left

        System.out.println("******* remove(object) method *********");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // index num: 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        numbers.remove(Integer.valueOf(30));
        /*
        If I pass/ enter primitive int , it takes that as index number !!
        Integer.valueOf(i:30) converts primitive , wrapper class object.
        That way , it's going to remove an element  by object not by index number
         */

        System.out.println("***** clear() method *****");

        System.out.println(numbers); // [10, 20, 40, 50]

        numbers.clear();
        // after clear method arraylist is cleared totally. It's going to be empty and size will be 0.

        System.out.println(numbers); // []
        System.out.println(numbers.size()); // 0

        System.out.println("****************");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Barney");// index: 0
        studentsList.add("Rachel");//1
        studentsList.add("Rachel");//2
        studentsList.add("Ross"); //3
        studentsList.add("Ross"); //4
        studentsList.add("Amy"); //5
        studentsList.add("Rachel"); //6

        System.out.println(studentsList.indexOf("Rachel")); //1
        System.out.println(studentsList.lastIndexOf("Rachel")); //6


        boolean hasRachel = studentsList.contains("Rachel");
        boolean hasAli = studentsList.contains("Ali");

        System.out.println(hasAli);
        System.out.println(hasRachel);

        System.out.println("************");

        ArrayList<Integer> list1= new ArrayList<>();

        ArrayList<Integer> list2 = list1; // reference to the same object

        list1.add(10); // change affects both of them(because the same object !!)

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2); //true

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        // l1 and l2 are two different object.
        System.out.println(l1); //[10]
        System.out.println(l2); // [0]

        System.out.println(l1==l2); // false
        System.out.println(list1.equals(l2)); // true

        System.out.println("*******************");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(20);
        n2.add(10);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // because they are not in the same order (So order matters for equals method[order sensitive])

        n1.clear(); //[]
        System.out.println(n1.isEmpty()); // true
        System.out.println(n2.isEmpty()); // false
    }
}
