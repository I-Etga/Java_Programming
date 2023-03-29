package wednesdays_office_hours.week8;

public class T2BeginningEnd {
    public static void main(String[] args) {

        String[] names = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly", "Meryem"};

        int count = 0;
        for (String name : names) {
            name = name.toLowerCase();
            if (name.charAt(0) == name.charAt(name.length() - 1)) {
                count++;

            }
        }
        System.out.println(count);

    }
}
