package wednesdays_office_hours.week_14.movies;

public class Netflix extends StreamingSite {
    @Override
    public void subscribe() {
        System.out.println("Subscribed to Netflix");
    }

    @Override
    public void playMovie(Movie movie) {

    }

    @Override
    public void pause() {

    }

    public Netflix(String url, int subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);


    }
}
