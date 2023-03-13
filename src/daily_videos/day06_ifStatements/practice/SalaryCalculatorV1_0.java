package daily_videos.day06_ifStatements.practice;

import java.util.Scanner;

public class SalaryCalculatorV1_0 {
    public static void main(String[] args) {

        // calculate the tax after salary

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Salary: ");
        int salary = scanner.nextInt();

        int salaryAfterTax = 0;

        System.out.print("Are you married? (False oder True)");
        boolean isMarried = scanner.nextBoolean();
        boolean isNotMarried = !isMarried;

        boolean taxIs35 = salary >= 130_000;
        boolean taxIs30 = salary >= 100_000 && salary <= 129_000;
        boolean taxIs25 = salary >= 80_000 && salary <= 99_000;
        boolean taxIs20 = salary <= 79_000;


        if (isMarried) {
            if (taxIs35) {
                salaryAfterTax = (salary) - (salary * 30 / 100);
            } else if (taxIs30) {
                salaryAfterTax = (salary) - (salary * 25 / 100);
            } else if (taxIs25) {
                salaryAfterTax = (salary) - (salary * 20 / 100);
            } else if (taxIs20) {
                salaryAfterTax = (salary) - (salary * 15 / 100);
            }
        } else if (isNotMarried) {
            if (taxIs35) {
                salaryAfterTax = (salary) - (salary * 35 / 100);
            } else if (taxIs30) {
                salaryAfterTax = (salary) - (salary * 30 / 100);
            } else if (taxIs25) {
                salaryAfterTax = (salary) - (salary * 25 / 100);
            } else if (taxIs20) {
                salaryAfterTax = (salary) - (salary * 20 / 100);
            }

        }
            System.out.println(salaryAfterTax);
    }
}
