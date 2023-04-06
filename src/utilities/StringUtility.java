package utilities;

public class StringUtility {

    public static String reverse(String str) { // / java
        String reverse = ""; //avaj
        // i = 3  2  1           i>=0
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
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
        return ("Uppercase: " + upperCase + "\nLowercase: " + lowerCase + "\nDigits: " + digits + "\nSpeacial Characters: " + specialsChar);
    }

    public static String capatilize(String str) {
        String[] eachWord = str.toLowerCase().trim().split(" ");
        String result = "";

        for (String each : eachWord) {
            result += each.substring(0,1).toUpperCase() + each.substring(1) +" ";
        }

        return result.trim();
    }
}

