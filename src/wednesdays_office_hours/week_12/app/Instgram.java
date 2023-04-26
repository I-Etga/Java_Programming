package wednesdays_office_hours.week_12.app;

public class Instgram extends App {
    public Instgram( double version) {
        super("Instagram", version);
    }

    public void postPicture() {
        System.out.println("Posting picture to " + getClass().getSimpleName());
    }

}
