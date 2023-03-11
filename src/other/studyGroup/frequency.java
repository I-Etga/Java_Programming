package other.studyGroup;


public class frequency {
    public static void main(String[] args) {

        FrequencyOfWord("Java JaVa java java ", "java"); // returns any result/value

        System.out.println("********* void and return method: ");

        String properCapitalName =properCapitalization("jAVa");
        System.out.println(properCapitalName);

/*
        String str = "ankara";
        String  str1 = str.substring(0, 1).toUpperCase()
                        +  str.substring(1).toLowerCase();
        System.out.println(str1);
 */
    }

    public static  void FrequencyOfWord(String str, String word) {

        str = str.toLowerCase();
        word = word.toLowerCase();
                                // to find the spaces between words
        String strWithoutWord = str.replaceAll(word, ""); // "" length 0
                            // .replace() == replaceAll() & replaceFirst() -- does NOT accept char
                                    // str.replaceAll('f','a'); --MUST BE STRING
/*
        System.out.println(strWithoutWord.isEmpty());
        System.out.println(strWithoutWord);
        System.out.println(strWithoutWord.length());


 */
                                // to remove the spaces between the words
                                //20            0                       / 4 = 4

        int frequencyOfWord = (str.length() - strWithoutWord.length()) / word.length();
        System.out.println(frequencyOfWord);
        return;
        // System.out.println("Frequency of word  in a sentence " + frequencyOfWord + " times");

    }


    public static String properCapitalization (String str){

        String properCapitalization = str.substring(0, 1).toUpperCase()
                                    +  str.substring(1).toLowerCase();
        return properCapitalization;
    }
}
/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA java", "java")  ==> 4

 */

/*
7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
 */