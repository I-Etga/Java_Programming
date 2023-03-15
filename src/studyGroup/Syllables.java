package studyGroup;

public class Syllables {
    public static void main(String[] args) {

        int numberOfSyllables = sylables("Ham-bur-ger");
        System.out.println(numberOfSyllables);

        System.out.println("*** they both return the same result ***");

        System.out.println(sylables("Ham-bur-ger"));
    }
    public static int sylables(String word){

        int count = 1;
        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) == '-'){
                count++;
            }
        }
    return count;
        /*

             "Ham- bur -ger"
             012(3-)56(7-)8910
             count i 4 2 i8 3

         I have to add to count one. Because there is for example for two syllables word only one hyphen.
         */
    }
}

/*
T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        apple -> 2
        ham-bur-ger -> 3
        de-liv-ery-y -> 4

 */