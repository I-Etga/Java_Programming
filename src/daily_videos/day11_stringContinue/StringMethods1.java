package daily_videos.day11_stringContinue;

public class StringMethods1 {
    public static void main(String[] args) {

        System.out.println("***** # .toLowerCase& toUpperCase# ******");

        String str1 = "CYDEO SCHOOL";

        str1.toLowerCase();//"cydeo school"


        /* Strings are unchangeable so str1 stays "CYDEO SCHOOL".
                But if we need a String in any other way like lowercase or upper case;
                         However if we reassign the String, it will be updated !!
         */
        System.out.println(str1);


        str1 = str1.toLowerCase(); //(same result) str1 = "cydeo school";
        System.out.println(str1);

        System.out.println("---------");


        String str2 = "java programming ";
        str2 = str2.toUpperCase();
        String str3 = str2.toUpperCase();

        System.out.println(str2);
        System.out.println(str3);

        System.out.println("---------");

        String word = "Wooden Spoon";

        word.toUpperCase(); // "WOODEN SPOON"

        word.toLowerCase(); // "wooden spoon"

        /*
        We have three different object above.
                but one variable(container)
                So as long as we do not reassign the variable, other values won't be saved in memory.
                That's why still return the first one.

         */

        word = word.toUpperCase();
        word = word.toLowerCase();
        /*
        In this case,the last one will be printed ! makes sense to me
         */
        System.out.println(word);

        System.out.println("***** # trim method  # ******");


        String str4 = "         Cydeo School";
                    // white space

       str4 =  str4.trim(); // Cydeo School (excluding any white space)

        System.out.println(str4);



        System.out.println("***** # .indexof() & .lastIndexOf() # ******");

        String sentence1 = "Today is Sunday, and we have Java Class";

        sentence1.indexOf(""); // returns the index of first character given by us
        System.out.println(sentence1.indexOf("a"));
                // ex: there are five a but it returns only index of the first a !!

        /*
        Read left to right and returns the index for the first char we're asking.
                    It could be more than once in other index to but ;
                            this method gives us the index of the first one.
         */


        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA= s1.indexOf("a ");

        String s2 = "Java Python JavaScript Cydeo Python ";

        int a1 = s2.indexOf('a');
        System.out.println(a1);

        /*
        methods checks the characters left to right and look for the whole block of String we've given.
        As soon as it finds what we wanted,it  returns the index of the FIRST character, NOT all of them.
         */
        int a2 = s2.indexOf("a Python"); // first it's gonna find the block of String"a Pyhton"
        System.out.println(a2);             // and returns the index of the first character which is 'a'in this case. It returns 15.

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);

        int a4 = s2.indexOf("aS");
        System.out.println(a4);

        String w2 = "Java Python JavaScript Cydeo Python ";


        System.out.println(w2.lastIndexOf('a')); // it returns the index of character given by us but THE LAST ONE so 15.
        System.out.println(w2.lastIndexOf('P')); // 29




    }
}
