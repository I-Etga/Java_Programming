package daily_videos.day07_IfStatements_Nested_ElseIf;

import java.util.Scanner;

public class LoanApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("salary: ");
        int salary = scanner.nextInt();
        System.out.println("credit score: ");
        int creditScore = scanner.nextInt();
        String eligibility = "";


        boolean isSalaryGreaterThan45 = salary >= 45_000;
        boolean isCreditScoreGreaterThan700 = creditScore >= 700;

        if (isCreditScoreGreaterThan700 && isSalaryGreaterThan45) {
            eligibility = "You are eligible for a loan";
        } else {
            eligibility = "You are NOT eligible for a loan";
        }
        System.out.println(eligibility);

        scanner.close();
    }
}
