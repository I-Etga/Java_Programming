package wednesdays_office_hours.week6;

import java.util.Scanner;

public class CharacterSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a String:");
        String str = scanner.next();
        System.out.println("Please enter a group:");
        String group = scanner.next();

        System.out.println(charSet(str,group));

    }
    public static String charSet(String str , String group) {
        String result = "";

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

        if(group.equalsIgnoreCase("uppercase")){
            result = upperCase;
        } else if (group.equalsIgnoreCase("lowercase")){
            result =lowerCase;
        }else if(group.equalsIgnoreCase("digits") || group.equalsIgnoreCase("numbers")){
            result = digits;
        }else if(group.equalsIgnoreCase("special character")){
            result = specialsChar;
        }else{
            result = "Invalid entry";
        }
        return result;
    }
}