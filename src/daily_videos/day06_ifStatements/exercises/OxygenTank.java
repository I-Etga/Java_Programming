package daily_videos.day06_ifStatements.exercises;
import java.util.Scanner;

public class OxygenTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Oxygen Level: ");
        int oxygenLevel = scanner.nextInt();

        String result = "";


        boolean isFull = oxygenLevel <=100 && oxygenLevel >=90;
        boolean isOK = oxygenLevel <90 && oxygenLevel >=80;
        boolean isDontGoTooFar = oxygenLevel <80 && oxygenLevel >=70;
        boolean isStartToHeadBack = oxygenLevel <70 && oxygenLevel >=60;
        boolean isBeCareful = oxygenLevel <60 && oxygenLevel >=50;
        boolean isBelow50 = oxygenLevel <50 && oxygenLevel >=0;
        boolean isInvalid = oxygenLevel <0 || oxygenLevel >100;

        if(isFull){
            result = "You tank is full";
        } else if (isOK) {
            result = "Still okay";
        } else if (isDontGoTooFar) {
            result = "Don't go too far";
        } else if (isStartToHeadBack) {
            result = "Start to head back";
        } else if (isBeCareful) {
            result = "Be careful how you at at 50% ";
        }else if(isBelow50){
            result= "Be careful oxygen level is below 50%";
        } else if (isInvalid) {
         result = "Invalid Percentage";
        }
        System.out.println(result);
    }
}
