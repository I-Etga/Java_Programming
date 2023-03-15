package wednesdays_office_hours.week6;

public class Syllables {
    public static void main(String[] args) {

        System.out.println(syllables("hamburger"));

    }

    public static int syllables(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}


/*
T3Syllables [methods, String, loops]

vowels a e i  o u

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        apple -> 1
        ham-bur-ger -> 3
        de-liv-ery-y -> 4
 */