package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class SwitchStatementIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("day number:");
        int n = scanner.nextInt();

        String day = " ";

        switch (n) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
                        /*
                                for example if I do not use break here, the code is being executed until the next break.
                                 In this case (we built the code that way) all the statements return the same variable "day".
                                     So if we miss a necessary break, we don't get the expected return.
                                                Instead we get the return of the last code before the next break.
                                    (the last break before closing braces of switch) ==> optional break !!
                         */
            default:
                day = "Invalid";
        }
        System.out.println(day);

        System.out.println("**********************");
        /*
                             these codes are normally gives the same result/
                                 but not using necessary "break" will MAKE DIFFERENCE
                                     because there is only one print statement in the first code
                                        and the last value will be printed.

                            in the second code there is in every single case a print statement.
                                 compiler executes every one of them.


                for example there is no break after case 3 and n==3;
                    return of the first code: Thursday (every single block reassing the value of the day variable)
                    return of the second code : Thursday and Friday (only one break is missing)

         */

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
