package daily_videos.day09_scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        String result = "";

        if (age >= 16 && age <=125){
            if(age >= 18) {
                result = "You're eligible to buy alcoholic beverages. Enjoy!";
            }else{
                result="You're not eligible to buy alcoholic beverages.\nYou can get you non-alcoholic beer or gin ";
            }
        }else{
            result = "Invalid. Please enter a real age!!";
        }
        System.out.println(result);


        System.out.println("****** // NESTED TERNARY !!*****");

        result = (age >= 16 && age <=125)? (age >= 18)?"You're eligible to buy alcoholic beverages. Enjoy!"
                            :"You're not eligible to buy alcoholic beverages.\nYou can get you non-alcoholic beer or gin "
                :"Invalid. Please enter a real age!!";

                    // the signs are as follow: result = (cond)?(cond)?value:value:value;
                                                        //    if-   ( if    else  )  - else
        System.out.println(result);
        scanner.close();
    }
}
