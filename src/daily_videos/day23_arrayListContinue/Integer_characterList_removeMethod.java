package daily_videos.day23_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Integer_characterList_removeMethod {
    public static void main(String[] args) {

        // Integer and Character arrayList.remove() method demands object not primitives.
                    // Otherwise, method does not work how we want  !!

        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 8));

        System.out.println("list.remove(int index) Vs. list.remove(Object o)");


        Integer a = 1;
        int b = 2;
        int c = 10;

        listInt.add(c); // adds the element 10(c). It does NOT  take int c as an index number !!

        listInt.remove(a);  // removes the element 1
        listInt.remove(b); // removes the element at index 2

        listInt.remove(0); // removes the element at index 3
        listInt.remove((Integer)3 ); // removes the element 3

        // [That difference does NOT exist in add() method !!]

        // there is no such a difference-problem for the other data types.
        // It's because index data type is int, but object must be non-primitive.(Wrapper Class)
        System.out.println(listInt); //[6, 7, 8, 10]

        System.out.println("*** Double ");

        ArrayList<Double> listDouble = new ArrayList<>(Arrays.asList(4.5, 6.7, 90.6, 12.3));

        Double dA = 4.5;
        double dB = 6.7;

        listDouble.remove(dA);  // removes the element 4.5

        listDouble.remove(dB); // removes the element 6.7 (Even if it's not wrapper class (dB is double(primitive)))

        listDouble.remove(90.6); // removes the element 90.6
        listDouble.remove(12.3); // removes the element 12.3

        System.out.println(listDouble); //[]
        // As you can see we haven't faced that kind of problem !! It worked both ways

        System.out.println("*** Character ");
        ArrayList<Character> listCharacter = new ArrayList<>(Arrays.asList('a','b','c','d','e'));

        char ch = 'q';
        listCharacter.add('f');// [a, b, c, d, e, f]
        listCharacter.add(ch);// [a, b, c, d, e, f, q] it's added even if it's primitive(char)

        //listCharacter.remove((ch); // If I pass char ,java takes that that char's ascii number as the index and will try to remove the element at that index.
        listCharacter.remove((Character) ch); // remove method does not work with primitives!!
        System.out.println(listCharacter);

    }
}
