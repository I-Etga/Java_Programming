package wednesdays_office_hours.week11;

public class Work {

    private String name;
    private int duration;
    private int caloriesBurned;

    public Work(String name, int duration, int caloriesBurned) {
        setName(name);
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

        if(caloriesBurned >0 && caloriesBurned<1000) {
            this.caloriesBurned = caloriesBurned;
        }
    }
}
/*
Workout [Encapsulation, access modifiers, classes, objects, methods]

        in the setters only set the values if they are valid data based on these requirements:
        name: should have only letters and spaces, no other characters type. The name cannot be empty either

        create another class to test the Workout objects
 */
