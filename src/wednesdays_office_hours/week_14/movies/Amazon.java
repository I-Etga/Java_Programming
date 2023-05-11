package wednesdays_office_hours.week_14.movies;

public class Amazon extends StreamingSite{
    public Amazon( int subscriptionAmount, int moviesAvailable) {
        super("www.amazon.com", subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to Amazon Prime Video");
    }

    @Override
    public void playMovie(Movie movie) {

    }

    @Override
    public void pause() {
        System.out.println("Paused with space");
    }
}
