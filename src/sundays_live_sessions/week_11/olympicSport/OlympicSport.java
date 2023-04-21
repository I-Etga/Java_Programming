package sundays_live_sessions.week_11.olympicSport;

public class OlympicSport {

    public String name;
    public int participants;

    public static int yearOfFirstOlympics;

    static {
        yearOfFirstOlympics = 1896;
    }

    public OlympicSport(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public void compete() {
        System.out.println("Players are competing");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                ", year=" + yearOfFirstOlympics +
                '}';
    }
}

