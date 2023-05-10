package wednesdays_office_hours.week_14.movies;

public class Hulu extends StreamingSite {
    public Hulu(String url, int subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
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
