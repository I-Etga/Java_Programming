package wednesdays_office_hours.week_12.app;

public class Youtube extends App {
    public Youtube( double version) {
        super("Youtube", version);
    }

    public void watchVideo() {
        System.out.println("Watching java tutorial on " + getClass().getSimpleName());
    }
}