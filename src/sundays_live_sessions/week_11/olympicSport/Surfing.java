package sundays_live_sessions.week_11.olympicSport;

public class Surfing extends  OlympicSport{
    public Surfing(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println("Surfing the waves");
    }
}


