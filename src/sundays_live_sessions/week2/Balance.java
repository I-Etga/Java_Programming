package sundays_live_sessions.week2;

public class Balance {
    /*

Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee of 20 % of the balance

    In both cases print the remaining balance after withdrawing
     */

    public static void main(String[] args) {

        double balance = 1000;
        double withdrawAmount = 1300;

       // balance = balance - withdrawAmount;
        balance -= withdrawAmount; // same as line 22

        if(balance < 0){ // this if only runs if you took out too much money
            System.out.println("Withdrew more than you in the account. Overdraft applied");
           balance += (balance * 0.2); // if there is an overdraft, we are applying a 20% fee
        }

        System.out.println("Total balance:" + balance);

    }

}
