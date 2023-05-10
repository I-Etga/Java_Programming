package wednesdays_office_hours.week_14.movies;

public class Amazon extends StreamingSite{
    public Amazon(String url, int subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
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

    }
}
