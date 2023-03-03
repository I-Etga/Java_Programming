package sunday_live_sessions.week02;

public class Balance {
    public static void main(String[] args) {
        double amountBalance = 1000;
        double withdrawAmount = 300;

        //amountBalance = amountBalance-withdrawAmount
                //line 8 and line 10 are identical !!
        amountBalance -= withdrawAmount;

        if(amountBalance <0) {
            System.out.println("Withdraw more than you in the account.Overdraft applied.");
            amountBalance += (amountBalance * 0.2);
        }
        System.out.println("Balance = " + amountBalance);
    }
}
