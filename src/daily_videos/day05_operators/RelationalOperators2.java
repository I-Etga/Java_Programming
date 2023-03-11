package daily_videos.day05_operators;

public class RelationalOperators2 {
    public static void main(String[] args) {

        // == EQUAL operator
                        //numbers
        System.out.println(1000 == 2000); // false

                        //String
        System.out.println("Java" == "Java"); // true
        System.out.println("Java" == " Java"); // false, because there is a space before J in the second string
                                                       // and that makes second different from first one

        System.out.println("java" =="JAVA");//False because java is uppercase lowercase sentivite computer language.
                        //boolean
        System.out.println(true == false); // false
        System.out.println((5>8) == true); //false beucase 5 is not greater than 8

        System.out.println("----------------------------");



                    //NOT EQUEL OPERATOR !=

        System.out.println(1000 != 2000); // true because 1000 is not equel to 2000

        //String
        System.out.println("Java" != "Java"); // true because the two strings are identical.
        System.out.println("Java" != " Java"); // true, because there is a space before J in the second string
                                                    // and that makes second different from first one

        System.out.println("java" !="JAVA");//true because java is uppercase lowercase sensitive computer language.

                        //boolean
        System.out.println(true != false); // true
        System.out.println((5>8) != true); //true beucase 5 is not greater than 8

        /*
                       == and = is not the same operator.
                == returns boolean and = assign a value to a variable
                        DIFFERENCE IS REALLY IMPORTANT

         */
        int x1 = 25;
        int y1 = 35;
        System.out.println(x1==y1); // equals operator returns true or false. DOES NOT ASSIGN ANY VALUE !!
        // x= 25 y =35
        System.out.println(x1=y1); // x has a new value(the value of y variable) after that assign operator.
        // updated data: x =35 y=35
        System.out.println(x1==y1); // true

        System.out.println("*********");
        int a1 = 45;
        int b1 = 50;
        System.out.println(b1 == a1); // false because they are not equal
        //b1 = a1; ---> even if we don't print it, the value of a1 will be assigned to b1.
        System.out.println(b1 = a1);
        // current data: a1= 45 b1= 45




    }
}
