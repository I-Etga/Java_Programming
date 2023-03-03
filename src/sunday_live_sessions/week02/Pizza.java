package sunday_live_sessions.week02;

public class Pizza {
    public static void main(String[] args) {
        String type;
        int slices, people;

        type = "cheese";
        slices = 8;
        people = 3;


        System.out.println("We ordered a " + type +" pizza with " + slices + " slices");
        System.out.println(people  + " people ate " +(slices/people)+ " slices each, "  + " so there was "+ (slices%people) +" remainder slices left");
    }
}
