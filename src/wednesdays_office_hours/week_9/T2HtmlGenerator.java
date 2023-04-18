package wednesdays_office_hours.week_9;

import java.util.Arrays;

public class T2HtmlGenerator {
    public static void main(String[] args) {

        // assume the number can only go to 9

        String request = "img2;div2;button3;ul1";
        String[] eachPart = request.split(";"); // [img2, div2, button3, ul1] -> returns String[]
        System.out.println(Arrays.toString(eachPart));
        //System.out.println(Arrays.toString(eachPart)); // "[img2, div2, button3, ul1]" - returns String

        String html = "";

        for (String each : eachPart) {

            String tag = each.substring(0, each.length() - 1);
            //               Integer.parseInt   ("2")  returns Integer 2
            int num = Integer.parseInt(each.replace(tag, "")); // each.substring(each.length()-1)
            String fullTag = "<" + tag + "> </" + tag + ">\n";

            html += fullTag.repeat(num);
            /*
                instead of repeat method
                for(int i = 0; i < num; i++){
                    html += fullTag;
                }
             */

        }

        System.out.println(html);
    }
}
