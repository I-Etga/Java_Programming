package daily_videos.day10_string;

import java.lang.String;
import java.lang.System;
                                                    /*
                                that two class imported implicitly (automatically)
                            So even if we would delete it, we would not see any error!
                                    only "lang" packages are imported implicitly.
                                                    */
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "Java ";


        System.out.println("****** by literal *********");
        String str1 = "Cat";
        String str2 = "Dog";

        String str3 = "Cat";
        String str4 = "Dog";

        /*
        Only one object created and share the same reference !!
         */

        System.out.println(str1 == str3); //true (same object)
        System.out.println(str2 == str4); // true   (same object)
        System.out.println(str1 == str2); //false

        System.out.println("********* by keyword *******");

        String s1 = new String("Java"); // creates two objects. 1-String pool, 2-in heap(outside string)

        String s2 = new String("Java");

        System.out.println(s1 == s2); // false (different objects)
        System.out.println(s2); // returns Java


        System.out.println("****");

        String t1 = "Python";  //string pool
        String t2 = new String("Python"); //in heap
        String t3 = new String("Python");   // in heap


        System.out.println(t1);
        System.out.println(t2);     //all return the same string but different objects
        System.out.println(t3);

        System.out.println(t1 == t2); // false
        System.out.println(t1 == t3); // false

        scanner.close();
    }
}
