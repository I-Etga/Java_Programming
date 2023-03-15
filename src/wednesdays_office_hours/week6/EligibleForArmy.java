package wednesdays_office_hours.week6;

public class EligibleForArmy {
    public static void main(String[] args) {


        eligibleForArmy(16,true,false);

    }

    public static void eligibleForArmy(int age, boolean hasHighSchool, boolean isCitizen) {
        String message = "";
        if ((age >= 18 && age <= 35) && hasHighSchool && isCitizen) {
            message = "You are qualified to join the Army";
        } else {
            message = "You are NOT qualified to join the Army";
            // age
            if (age < 18) {
                message += "\n" + age + " is less than our minimum age";
            } else if (age > 35) {
                message += "\n" + age + " is more than our maximum age";
            }
            //diploma
            if (!hasHighSchool) {
                message += "\nYou must have a high school diploma";
            }
            // citizenship
            if (!isCitizen) {
                message += "\nYou must be a citizen";
            }
        }
        System.out.println(message);
    }
}






