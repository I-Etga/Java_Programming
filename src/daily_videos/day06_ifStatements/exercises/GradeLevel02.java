package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class GradeLevel02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give your grade level 1-18: ");
        int gradeLevel = scanner.nextInt();

        //String result ; // this is a local variable
        String result = ""; // this is just temporary value

        if(gradeLevel >=1 && gradeLevel<= 5){
            result = "Elementary School";
        } else if (gradeLevel >= 6 && gradeLevel<= 8) {
            result= " Middle School";
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = "High School";
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            result = "College";
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            result = "Grad School";
        }else{
            System.out.println("You've given unvalid grade level.");
            System.out.println("Please type a number between 1 and 18");
        }
        System.out.println(result);
    }
}
