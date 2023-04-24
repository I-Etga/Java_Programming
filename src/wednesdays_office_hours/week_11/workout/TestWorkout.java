package wednesdays_office_hours.week_11.workout;

public class TestWorkout {
    public static void main(String[] args) {

        Workout bench = new Workout("Bench Press", 60, 100);
        System.out.println(bench);

        Workout pushup = new Workout("Pushup23", -10, 2000); // all invalid data
        System.out.println(pushup);

        pushup.setName("Push Up"); // obj.name
        pushup.setDuration(10);
        pushup.setCaloriesBurned(120);

        System.out.println("Doing " + pushup.getName() + " for " + pushup.getDuration() + " minutes and burning " + pushup.getCaloriesBurned() + " calories");

        System.out.println(new Workout("", 0, 0).getName()); // to test if I give empty String

    }
}
