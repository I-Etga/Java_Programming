package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        String result = "";
        boolean isBaby = age == 0;
        boolean isInfant = age >= 1 && age <= 2;
        boolean isToddler = age >= 3 && age <= 5;
        boolean isKid = age >= 6 && age <= 9;
        boolean isPreTeen = age >= 10 && age <= 12;
        boolean isTeenager = age >= 13 && age <= 17;
        boolean isYoungAdult = age >= 18 && age <= 20;
        boolean isAdult = age >= 21 && age <= 39;
        boolean isYoungMiddleAged_adult = age >= 40 && age <= 49;
        boolean isMiddleAged = age >= 50 && age <= 54;
        boolean isVeryYoungSeniorCitizen = age >= 55 && age <= 64;
        boolean isYoungSeniorCitizen = age >= 65 && age <= 74;
        boolean isSeniorCitizen = age >= 75 && age <= 84;
        boolean isOldSeniorCitizen = age >= 85 && age <=120 ;

        if (isBaby){
            result = "Baby";
        }else if(isInfant) {
            result = "Infant";
        } else if (isToddler) {
            result = "Toddler";
        } else if (isKid) {
            result = "Kid";
        } else if (isPreTeen) {
            result = "Pre-Teen";
        } else if (isTeenager) {
            result = "Teenager";
        } else if (isYoungAdult) {
            result = "Young Adult";
        } else if (isAdult) {
            result = "Adult";
        } else if (isYoungMiddleAged_adult) {
            result = "Young Middle Aged Adult";
        } else if (isMiddleAged) {
            result = "Middle-Aged Adult";
        } else if (isVeryYoungSeniorCitizen) {
            result = "Very Young Senior Citizen";
        } else if (isSeniorCitizen) {
            result = "Senior Citizen";
        } else if (isOldSeniorCitizen) {
            result = "Old Senior Citizen";
        } else {
            result = "Please enter a valid age";
        }

        System.out.println(result);

    }
}
