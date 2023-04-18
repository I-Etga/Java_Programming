package wednesdays_office_hours.week11.workout;

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
            System.exit(1);
        }

        char[] chars = name.toCharArray();

        for (char ch : chars) {
            if (!(Character.isLetter(ch) || Character.isSpaceChar(ch))) {
                System.out.println("Name can contain only letters and space !!");
                System.exit(1);
            }
        }
        this.name = name;
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
        }else{
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

