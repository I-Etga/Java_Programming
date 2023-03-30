package daily_videos.day22_wrapperClasses;

import daily_videos.day03_variables.Char;
import daily_videos.day05_operators.ShorthandOperators;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1); //201


        int num = Integer.parseInt(str); // unboxing
        System.out.println(num); //20

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);


        System.out.println("---------------");

        String s = "20.5";

        Double d1 = Double.valueOf(s); // valueOf() -String to WRAPPER class value .
        double d2 = Double.parseDouble(s);// parseDouble() -String to PRIMITIVE .

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("-----------------");

        String x = "true";

        Boolean b1 = Boolean.valueOf(x);
        boolean b2 = Boolean.parseBoolean(x); // parse method is a case-sensitive method !

        // as long as "true " , it returns true.

        System.out.println(b1);// returns true
        System.out.println(b2);// returns true

        // Otherwise I'll get default value : false

        x = "maybe";
        b1 = Boolean.valueOf(x);
        b2 = Boolean.parseBoolean(x);

        System.out.println(b1); // returns false
        System.out.println(b2);// returns false

        System.out.println("-------------");

        char ch = 'a';
        // checks the char value is digit or not !!
        boolean isDigit = Character.isDigit(ch);

        // checks the char value is digit or not !!
        boolean isLetter = Character.isLetter(ch);

        // // checks the char value is in lowercase or not !!
        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        // checks the char value is in uppercase or not !!
        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        // checks the char value is special char .
        // if char is not digit or letter , IT MUST BE SPECIAL CHARACTER.
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);

        // checks the char value is space or not !!
        boolean isSpaceChar = Character.isSpace(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialChar = " + isSpecialChar);
        System.out.println("isSpaceChar = " + isSpaceChar);


        System.out.println("--------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char c : string.toCharArray()) {
            if(Character.isDigit(c)){
                sum += Integer.parseInt(""+ c);
            }
        }
        System.out.println(sum);

    }
}
