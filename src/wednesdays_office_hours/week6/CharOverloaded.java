package wednesdays_office_hours.week6;

public class CharOverloaded {
    public static void main(String[] args) {

        System.out.println(charSetWLimits('|', '|'));

    }

    public static String charSet(String str) {
        String upperCase = "";
        String lowerCase = "";
        String digits = "";
        String specialsChar = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCase += str.charAt(i);
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCase += str.charAt(i);
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digits += str.charAt(i);
            } else {
                specialsChar += str.charAt(i);
            }

        }
        return ("Uppercase: "+upperCase + "\nLowercase: " + lowerCase + "\nDigits: " + digits + "\nSpeacial Characters: " + specialsChar);
    }

    public static String charSetWLimits(char ch1, char ch2){

        String word = "mnbvftyuijuhgfe4r56|789iuygfd789:;<=>?@ABCDEFGHIJKLMNOP34567890|plkjnbvcdrtyujhgfdew2345678";
        String charSet ="";

        for (int i = word.indexOf(ch1); i <= word.lastIndexOf(ch2); i++) {
            charSet += word.charAt(i);
        }
        return charSet ;
    }
}
/*
T5CharacterOverloaded [methods, loops, overloading]

    Overload the previous Character Set method by having these parameters:
        char, char

    instead of a fixed set of characters this method will return a String of all the characters between the two defined char parameters

        the first char will determine the starting point and the second character will determine the ending point

    Note: Be careful, if you give characters that cannot be within a range based on the ascii table your method will not work

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
 */