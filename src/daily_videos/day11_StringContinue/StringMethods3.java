package daily_videos.day11_StringContinue;

public class StringMethods3 {
    public static void main(String[] args) {

        System.out.println("***** # .isEmpty() # ******");

        String word = "Java";

        boolean r1 = word.isEmpty(); // false

        System.out.println(r1);

        /*         THERE IS A TINY DIFFERENCE
                empty => no characters in the String even spaces.
                blank => it only has spaces/ white spaces
         */

        System.out.println("***** # .isBlank() # ******");

        String str = "         ";

        boolean r2 = str.isBlank(); // true 
        System.out.println(r2);


        System.out.println("*** # .equals() # ***");

                        /* == and .equals() are different from each other.
                            Do not use it, if you don't really have to

                                              */


        String strA = "Cydeo";  // String pool in heap memory
        String strAa = "Cydeo"; // String pool and shares the same literal with the strA!

        String strB = new String("Cydeo"); // not String pool, outside pool but in heap memory instead independent.


        System.out.println(strA == strAa); // true (share the same literal in string pool)
        System.out.println(strA == strB); // false (different objects)

        String strC = new String("cydeo");

        System.out.println(strA.equals(strC)); // checks if both of strings have same characters.(CASE SENSITIVE)-so returns false


        System.out.println("*** # .contains() # ***");


        String students = "Hasan Naran Sumeye Natalia";

        boolean hasAhmad = students.contains("Ahmad");
        System.out.println(hasAhmad); // false because there is no Ahmad in students string.

        boolean hasNaran = students.contains("Naran");
        System.out.println(hasNaran); //true. students String contains "Naran"


        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        // we can ignore case sensivity
        System.out.println("hasJava= " + hasJava);


        System.out.println("*** #.startsWith(str) & .endsWith(str) #");
        // return boolean \\
        sentence = "Cybertek School is the best";

        System.out.println(sentence.startsWith("Cybertek")); //true. Sentence String starts with Cybertek.

        System.out.println("-----");

        String name = "Michael";

        boolean l = name.startsWith("Da");
        System.out.println(l); // false. Because name does not start with "Da".

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);

        boolean t = url.endsWith(".com");

        System.out.println(t);

        System.out.println("-----");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail); //true
        System.out.println("isYahoo = " + isYahoo); //false
        System.out.println("isHotmail = " + isHotmail); // false


    }
}
