package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 0-9: ");
        int i = scanner.nextInt();

        String numberWithLetters = "";

        boolean isZero = i == 0;
        boolean isOne = i == 1;
        boolean isTwo = i == 2;
        boolean isThree = i == 3;
        boolean isFour = i == 4;
        boolean isFive = i == 5;
        boolean isSix = i == 6;
        boolean isSeven = i == 7;
        boolean isEight = i == 8;
        boolean isNine = i == 9;
        boolean isInvalid = i <0 || i>9;

        if (isZero){
            numberWithLetters = "Zero";
        } else if (isOne) {
            numberWithLetters = "One";
        } else if (isTwo) {
            numberWithLetters = "Two";
        } else if (isThree) {
            numberWithLetters = "Three";
        } else if (isFour) {
            numberWithLetters = "Four";
        } else if (isFive) {
            numberWithLetters = "Five";
        } else if (isSix) {
            numberWithLetters = "Six";
        } else if (isSeven) {
            numberWithLetters = "Seven";
        } else if (isEight) {
            numberWithLetters = "Eight";
        } else if (isNine) {
            numberWithLetters = "Nine";
        } else if (isInvalid) {
            System.out.println("Invalid Input. Please enter a number between 0-9");
        }
        System.out.println("The number you've just entered is : " + numberWithLetters );
    }
}
