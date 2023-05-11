package wednesdays_office_hours.week_14.movies;

public class Hulu extends StreamingSite {
    public Hulu( int subscriptionAmount, int moviesAvailable) {
        super("www.hulu.com", subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to Hulu");
    }

    @Override
    public void playMovie(Movie movie) {

    }

    @Override
    public void pause() {

    }
}
