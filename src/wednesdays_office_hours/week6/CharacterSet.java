package wednesdays_office_hours.week6;

public class CharacterSet {
    public static void main(String[] args) {

        System.out.println(charSet("esurditfoygpu[hio'nkbv43iCXOYTVYBCFPG6879Y"));

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

}

/*
T4CharacterSet [methods, loops]

    Create a method that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    based on the defined parameter return a String will all of the characters in the range

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.
 */