package wednesdays_office_hours.week9;

import java.util.Arrays;

public class T2HtmlGenerator {
    public static void main(String[] args) {

        String str = "ul1;li2;button2";

        String [] strSplit = str.split(";"); // [ul1, li3, button2]

        System.out.println(Arrays.toString(strSplit));

        for (String each : strSplit) {
            // first, we get a substring from the last character of String,and convert it to int in order to use as a number.
            int count = Integer.parseInt(each.substring(each.length()-1));

            //System.out.println(count);
            //int count = each.charAt(each.length()-1) -48; // OLD VERSION SOLUTION . it works but only with digits (0-9)

            for (int i = 0 ; i < count; i++){
                System.out.println("<" + each.substring(0,each.length()-1) + "> " + "</" +each.substring(0,each.length()-1) + ">"  );
            }
        }

    }
}
