package sunday_live_sessions.week03;

public class OxygenLevel {
    public static void main(String[] args) {

        int oxygenLevel = 55;
        String warning = "";

        if (oxygenLevel >= 0 && oxygenLevel <= 100 ){
            if (oxygenLevel >= 90) {
                warning = "Your tank is full ";
            } else if (oxygenLevel >= 80) {
                warning = "A lot left to use";
            } else if (oxygenLevel >= 70) {
                warning = "Don't go too far";
            } else if (oxygenLevel >= 60) {
                warning = "Start to head back";
            } else if (oxygenLevel >= 50) {
                warning = "Be careful now you are at 50%";
            } else {
                warning = "Critical";
            }
        }else{
            warning = "Error !! Invalid Percentage";
        }
        System.out.println(warning);
    }
}
