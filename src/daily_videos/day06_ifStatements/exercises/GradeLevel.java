package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give your grade level 1-18: ");
        int gradeLevel = scanner.nextInt();

        if(gradeLevel >=1 && gradeLevel<= 5){
            System.out.println("Elementary School");
        } else if (gradeLevel >= 6 && gradeLevel<= 8) {
            System.out.println(" Middle School");
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println("High School");
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println("College");
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println("Grad School");
        }else{
            System.out.println("You've given unvalid grade level.");
            System.out.println("Please type a number between 1 and 18");
        }
    }
}
