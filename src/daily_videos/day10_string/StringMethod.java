package daily_videos.day10_string;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {

        String str = "Cydeo";
        //index:      01234

        System.out.println("******* # .charAt() # *******");
        char stChar = str.charAt(0);
        char ndChar = str.charAt(1);
        char rdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

       /*
                char sixthChar = str.charAt(5);
        If we enter an invalid index number, program fails ! (gives error)
        */
        System.out.println("stChar = " + stChar);
        System.out.println("ndChar = " + ndChar);
        System.out.println("rdChar = " + rdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("******* # .length() # *******");

        String sentence = "Java Programming Language";
        //How many characters are there in String (returns integer)
        // spaces, special characters... everything will be counted.
        System.out.println(sentence.length()); // 25
        int length = sentence.length();
        int lastIndex = length - 1;
        System.out.println(lastIndex);

        System.out.println("**** # last index/character # ****");

        String s1 = "Java is the best programming language";
        char f = s1.charAt(0);

        int lastIndexNumber = s1.length() - 1;

        char l = s1.charAt((lastIndexNumber));

        System.out.println(f + " " + l);

        /*
         If there is no character in String, .length() is zero and index does NOT EXIST.
         */


        System.out.println("********");

        String name1 = "Umcan";
        String name2 = new String("Umran");
        System.out.println(name2 == name1);


        System.out.println("**** # .equals # ****");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");
        System.out.println(r1 == r2); // true
        System.out.println(r2 == r3);  //false
        System.out.println(r1 == r3);    //false

        System.out.println(r1.equals(r3)); // true (compare the texts not objects)
        System.out.println(r2.equals(r3));


        System.out.println("******");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you ?");
        int age = scanner.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = scanner.next();
        String result = "";
        if (age >= 21 && answer.equals("yes")) {
            result = "Eligible to vote";
        } else {
            result = "Not eligible to vote";
        }
        System.out.println(result);
    }
}
