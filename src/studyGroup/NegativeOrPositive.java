package studyGroup;

import java.util.Scanner;

public class NegativeOrPositive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negative = 0;
        int positive = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number:");
            int number = scanner.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        System.out.println(positive +" positive and " + negative + " negative");


        System.out.println("****WHILE LOOP****");

        int negative1 = 0;
        int positive1 = 0;

        int iter = 0;

        while(iter<5){
            System.out.println("Please enter a number:");
            int number = scanner.nextInt();
            if (number > 0) {
                positive1++;
            } else if (number < 0) {
                negative1++;
            }
            iter++;
        }
        System.out.println(positive1 +" positive and " + negative1 + " negative");
    }
}
