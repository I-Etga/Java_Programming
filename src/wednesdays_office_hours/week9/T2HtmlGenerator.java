package wednesdays_office_hours.week9;

import java.util.Arrays;

public class T2HtmlGenerator {
    public static void main(String[] args) {

        // assume the number can only go to 9

        String request = "img2;div2;button3;ul1";
        String[] eachPart = request.split(";");
        System.out.println(Arrays.toString(eachPart));
        String html = "";

        for (String each : eachPart) {

            String tag = each.substring(0, each.length() - 1);
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
