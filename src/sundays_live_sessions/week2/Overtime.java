package sundays_live_sessions.week2;

public class Overtime {
    /*
    Overtime [if else, operators, variables]

	Declare and assign the following variables
		hourly rate & number of hours worked

	Calculate your total net pay for the week. Also consider if any overtime should be paid. Overtime will be 1.5 times the normal rate and should be paid for every hour over 40.
	(if you worked 43 hours total, you will get 40 hours normal pay and 3 hours overtime pay)

	Output different messages based on overtime
		if normal hours were worked (40 hours or less):
			You worked $hours hours, so your total net pay is: $netPay

		if you worked overtime (more than 40 hours):
			Wow you worked $hours hours so you will get $overtime_hours of overtime. Your net pay is $netPay

     */
    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int hoursWorked = 46;
        double netPay;
        String message;

        if(hoursWorked > 40){
            int overtimeHours = hoursWorked - 40;
            netPay = hourlyRate * 40; // your normal pay from 40 hours
            netPay += hourlyRate * 1.5 * overtimeHours; // for overtime you get paid 1.5 times your rate
            message = "Wow you worked " + hoursWorked + " so you will get " + overtimeHours + " hours of overtime. Your net pay is $" + netPay;
        } else { // worked less than or equal 40 hours
            netPay = hourlyRate * hoursWorked;
            message = "You worked " + hoursWorked + " hours, so your total net pay is: $" + netPay;
        }

        System.out.println(message);
    }
}
