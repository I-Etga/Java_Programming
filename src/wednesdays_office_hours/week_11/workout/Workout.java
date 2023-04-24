package wednesdays_office_hours.week_11.workout;

public class Workout {

    private String name;
    private int duration;
    private int caloriesBurned;

    public Workout(String name, int duration, int caloriesBurned) {
        setName(name);
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Name can not be empty or blank !!");
            return;
        }

        boolean isValid = true;
        char[] chars = name.toCharArray();
        for (char ch : chars) {
            if (!(Character.isLetter(ch) || Character.isSpaceChar(ch))) {
                System.out.println("Name can contain only letters and space !!");
                isValid = false;
                return;
            }

            /*  alternative of toCharArray()
              for(int i = 0; i < name.length(); i++){
           if(!Character.isLetter(name.charAt(i)) && name.charAt(i) != ' '){ // checks if the character is not a letter or not a space
               isValid = false;
               break;
           }
             */
        }
        if (isValid) {
            this.name = name;
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {

        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Duration can not be zero or negative !!");
            System.exit(1);
        }
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {

        if (caloriesBurned > 0 && caloriesBurned < 1000) {
            this.caloriesBurned = caloriesBurned;
        } else {
            System.out.println("Burned Calories can be between 0-1000");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}

