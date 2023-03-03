package sunday_live_sessions.week02;

public class Overtime {
    public static void main(String[] args) {
        double hourlyRate = 50.0;
        int hoursWorked = 34;
        double netPay;
        String message ;

        if(hoursWorked > 40){
            int overtimeHours = hoursWorked - 40;
            netPay = hourlyRate * 40; // normal pay from 40 hours
            netPay += hourlyRate * 1.5 * overtimeHours;
            message = "You worked " + hoursWorked + " hours. So you will get " + overtimeHours + " hours of overtime." +
                    " Your net pay is €" + netPay;
        }else{
            netPay = hourlyRate * hoursWorked;
            message = "You worked " + hoursWorked + " hours, so your total net pay is: € "+ netPay;
        }
        System.out.println(message);
    }
}

