package studyGroup;

public class Army {
    public static void main(String[] args) {
        eligibleForArmy(30, true, true);
    }

    public static void eligibleForArmy(int age, boolean hasDiploma, boolean isCitizen) {

        String message = "";
        String messageNo= "";

                /*if we use or || operator one of the condition is true then it return true.
                        // age = 55;
                        55                 true         true
                true    ||    false    &&   true     &&       true
                        true                true            true
         */

        if ((age >= 18 && age <= 35) && hasDiploma && isCitizen) {
            message += "You are qualified to join the Army";
            System.out.println(message);
        } else {
            messageNo += "You are NOT qualified to join the Army:\n";

            if ((age < 18)) {
                messageNo += age + " is less than our minimum age\n";
            } else if ((age > 35)) {
                messageNo += age + " is more than our maximum age\n";

                // !false
                if (!hasDiploma) {
                    messageNo += "You must have a high school diploma;\n";
                }
                if (!isCitizen) {
                    messageNo += "You must be a citizen";
                }
            }
            System.err.println(messageNo);
        }
    }
}
