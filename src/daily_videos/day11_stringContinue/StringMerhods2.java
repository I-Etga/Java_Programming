package daily_videos.day11_stringContinue;

public class StringMerhods2 {
    public static void main(String[] args) {

        System.out.println("**** # .replace() & .replaceFirst() ");
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence.replace("Python", "Java"); // sentence is still the same. This is a new object.

        /*
                        There are ways to use the new value
                        1- reassign the new value to the old variable --> sentence = sentence.replace("Python","Java");
                        2-create a new variable and assign it --> sentenceNew = sentence.replace("Python","Java");
                        3- or just use that as a value --> System.out.println(sentence.replace("Python","Java");)

                        BUT NEVER FORGET STRINGS DOES NOT CHANGE AUTOMATICALLY. THEY ARE TECHNICALLY UNCHANGEABLE !!

         */

        sentence = sentence.replace("Python", "Java");// after assigning it, old object goes to the garbage.

        System.out.println(sentence);

        System.out.println("---");

        String word = "java";
        word = word.replace('a', 'e');
        System.out.println(word); // "jeve"

        System.out.println("***");

        String sentence2 = "I love Java, Java is cool";

        sentence2 = sentence2.replaceFirst("Java", "Python"); //I love Python, Java is cool
        System.out.println(sentence2);

        /* If I want to replace only the first one which matches to given expression,
            I should use .replaceFirst() methode.
         */


        String sentence3 = "I love Java, Java is cool, Java is amazing";
        /*
                    if I want to not every and other than the first, I should make it UNIQUE !!
                    You can obviously see ", Java " is second and third Java but our method is replaceFirst().
                    And last thing you shouldn't forget is replacement should be also updated -
                                                        -according to the place of old one(, and spaces)
        */
        sentence3 = sentence3.replaceFirst(", Java ", ", Python ");

        System.out.println(sentence3);

        System.out.println("******** # .substring(beginning,ending) & .substring(beginning) # ********");

        /*
                creates a new String starting from the first index and ends in the last index.
                        the last index is always exclude.
         */

        String sentence4 = "I love Java Programming";

        String language = sentence4.substring(7, 11); // "Java Programming" "to make sure (7, 10+1)

        System.out.println(language);


        System.out.println("------");
        String sentence5 = "Today is Sunday, Tomorrow is Monday";
                        //  0123456789
        String today = sentence5.substring(9, 14 + 1);
        System.out.println(today);

        System.out.println("------");

        String email = "CydeoSchoolJavaprogramming@yahoo.com";

        int indexBeginning = email.indexOf("@");
        int indexEnding = email.indexOf(".");

        String domain = email.substring((email.indexOf("@") + 1), email.indexOf("."));

        System.out.println(domain);


        System.out.println("********");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') + 1);
        // I use the index of the last space as a reference!!
        System.out.println(tomorrow);

        System.out.println("********");

        String sentence8 = "I study at Cydeo School";
                        //  012345678910    10 belongs to the space before Cydeo
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName); // "Cydeo School"

        System.out.println("**** # .repeat() ");


        String str = "Python";
        String result = str.repeat(10); // returns a String includes "count" times old string !

        String result1 = (str + "\n").repeat(10); // we can concatenation here !!

        System.out.println(result);
        System.out.println(result1);


    }
}
