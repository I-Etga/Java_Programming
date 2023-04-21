package sundays_live_sessions.week_11.olympicSport;

public class Track extends OlympicSport {
    public Track(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println("Track for running, jumping, throwing");
    }
}

