package daily_videos.day08_ternary_switch;

public class TernaryIntro02 {
    public static void main(String[] args) {


        int number = -7;
     /*
        String result = "";
        if(number >0){
            result="Positive";
        } else if (number<0) {
            result = "Negative";
        }else{
            result = "Zero";
        }
      */

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        // else-if = else=: if= ? --> condition before ?(if) -- :(condition)?
        // DO NOT FORGET total number of : and ? MUST BE SAME !!
        System.out.println(result);


        System.out.println("**********");

        int n = 6;
        /*
        String day = "";
        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        }else if (n == 4) {
                day = "Thursday";
        } else if (n == 5) {
                day = "Friday";
        } else if (n == 6) {
                day = "Saturday";
        } else {
                day = "Sunday";
        }
         */
    String day = (n==1)?day="Monday":(n==2)?day="Tuesday":(n==3)?day="Wednesday":(n==4)?day="Thursday":(n==5)?day="Friday":(n==6)?day="Saturday":"Sunday";

        System.out.println(day);

    }
}