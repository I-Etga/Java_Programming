package sundays_live_sessions.week_11.olympicSport;

public class Soccer extends OlympicSport{
    public Soccer(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println("Playing a soccer game");
    }
}