package wednesdays_office_hours.week11.workout;

public class TestWorkout {
    public static void main(String[] args) {

        Workout workout = new Workout("Can Ozan", 90, 500);
        System.out.println(workout);

        // We get error. Name can not contain any characters except space and also digits !!
        // Also, calories must be between 0-1000
        // getName gets executed first. That's why we get error about invalid name and program gets terminated.
        Workout workout1 = new Workout("Kaya Dere6", 90, 1500);
        System.out.println(workout1); //
    }
}
