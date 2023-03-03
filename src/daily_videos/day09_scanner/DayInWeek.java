package daily_videos.day09_scanner;

import java.util.Scanner;

public class DayInWeek {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        if we want to use Scanner only once , we don't have to declare a variable of Scanner class like scanner !!
        Variables provide us, that we use something more than once .

         #1  int numberOfDay = new Scanner(System.in).nextInt();

         We can use Scanner without declaring a variable even in if statement, IF we use only ONCE.
          String result = "";
        #2 if(new Scanner(System.in).nextInt() ==1){
            result = "Monday";
          ...
 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int numberOfDay = scanner.nextInt();


        String day = "Invalid";
        // TERNARY
        if (numberOfDay >= 1 && numberOfDay <= 7) {
            day = numberOfDay == 1 ? "Monday"
                    : numberOfDay == 2 ? "Tuesday"
                    : numberOfDay == 3 ? "Wednesday"
                    : numberOfDay == 4 ? "Thursday"
                    : numberOfDay == 5 ? "Friday"
                    : numberOfDay == 6 ? "Saturday"
                    : "Sunday";
        }
        System.out.println(day);

        scanner.close();


    }
}
