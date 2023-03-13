package daily_videos.day06_ifStatements.practice;

import java.util.Scanner;

public class Cigarettes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your age: ");
        int age = scanner.nextInt();
        boolean isEligibleToBuyCigarettes = age >= 18 && age <= 100;

        if(isEligibleToBuyCigarettes){
            System.out.println("You are  eligible to buy Cigarettes");
        }
        if(!isEligibleToBuyCigarettes){
            System.out.println("You are not eligible to buy Cigarettes");
        }


        System.out.println("********ALTERNATIVE*********");

        if(age >= 18 && age <=100){
            System.out.println("You are  eligible to buy Cigarettes");
        }
        if(age < 18 || age >100){
            System.out.println("You are not eligible to buy Cigarettes");
        }


    }
}
