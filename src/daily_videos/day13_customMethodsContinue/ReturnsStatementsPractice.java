package daily_videos.day13_customMethodsContinue;

import java.util.Scanner;

public class ReturnsStatementsPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C'
                || grade == 'D' ||grade == 'F';
        if (!isValid){
            System.err.println("Invalid grade");
            return;
            //It termanates the main method!!
        }
        System.out.println((grade == 'A')?"Excellent":(grade == 'B')?"Great Job"
                                :(grade == 'C')?"Good"
                                : (grade == 'D')?"Passed":"Failed");
    }
}
