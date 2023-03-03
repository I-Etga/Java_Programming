package daily_videos.day04_concatenation.exercises;

public class SalaryCalculator {
    public static void main(String[] args) {


                            // YOU CAN USE Math.round()

        int hourlyRate = 50;
        int weeklyhours = 45;
        int grossPay = hourlyRate * weeklyhours * 52;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;

        System.out.println("Gross pay is: " + "$" + Math.round(grossPay));
        System.out.println("Federal Tax is: " +"$" + Math.round(grossPay * federalTaxRate));
        System.out.println("State Tax is: " + "$" +Math.round(grossPay * stateTaxRate));
        System.out.println("Net income is: " +"$" + Math.round(grossPay - ((grossPay * federalTaxRate)+(grossPay*stateTaxRate))));

    }
}
