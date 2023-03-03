package daily_videos.day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {


                            // YOU CAN USE Math.round()

        int hourlyRate = 50;
        int weeklyhours = 45;
        int grossPay = hourlyRate * weeklyhours * 52;
        double stateTaxRate = 0.06; // we can assign the value 6 and this would be implicit casting
        double federalTaxRate = 0.26;


        System.out.println("Gross pay is: " + "$" + Math.round(grossPay));
        System.out.println("Federal Tax is: " +"$" + Math.round(grossPay * federalTaxRate));
        System.out.println("State Tax is: " + "$" +Math.round(grossPay * stateTaxRate));
        System.out.println("Net income is: " +"$" + Math.round(grossPay - ((grossPay * federalTaxRate)+(grossPay*stateTaxRate))));
                    // ALTERNATIVE WAY I
                        // declare the federal tax, state tax , total tax and net income as a variable and assign the value.
                            // then print this already declared and assigned variables.
        /*
        System.out.println("Gross Pay = $" + grossPay);
        System.out.println("Federal Tax Rate $= " + federalTaxRate);
        System.out.println("State Tax Rate $= " + stateTaxRate);
        System.out.println(" Total Tax = $" + totalTax);
        System.out.println(" Net Income = $" + netIncome)
        */
                        //ALTERNATIVE WAY II
          /*      // If rates were 6 and 26 (using division /) instead of 0.06 and 0.25
        System.out.println("Gross pay is: " + "$" + grossPay);
        System.out.println("Federal Tax is: " +"$" + (grossPay * federalTaxRate/100));
        System.out.println("State Tax is: " + "$" + (grossPay * stateTaxRate/100));
        System.out.println("Net income is: " +"$" + Math.round(grossPay - ((grossPay * federalTaxRate/100)+(grossPay*stateTaxRate/100))));
        */
    }
}
