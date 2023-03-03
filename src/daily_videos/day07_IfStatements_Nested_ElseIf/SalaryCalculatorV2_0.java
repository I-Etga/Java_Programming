package daily_videos.day07_IfStatements_Nested_ElseIf;

import java.util.Scanner;

public class SalaryCalculatorV2_0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your gross salary: ");
        int salary = scanner.nextInt();
        System.out.print("Are you married or not? / True oder False ");
        boolean isMarried = scanner.nextBoolean();


        double taxRate = 0;
        String maritalStatus = "";

        if(salary >= 130_000  ){
            taxRate =0.35;
        } else if (salary >=100_000) {
            taxRate = 0.30;
        } else if (salary >= 80_000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried){
            taxRate = (taxRate-0.05);
            maritalStatus = "Married";
        }else{
            maritalStatus = "Not Married";
        }

        double salaryAfterTax = salary - (salary * taxRate);

        System.out.println("salary = " + salary);
        System.out.println("maritalStatus = " + maritalStatus);
        System.out.println("taxRate = " + taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);


        scanner.close();
    }
}
