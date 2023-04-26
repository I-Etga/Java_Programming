package wednesdays_office_hours.week_12.app;

public class Instgram extends App {
    public Instgram( double version) {
        super( version); // super(getClass().getName(), version)
    }

    public void postPicture() {
        System.out.println("Posting picture to " + getClass().getSimpleName());
    }

}
