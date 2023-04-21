package sundays_live_sessions.week_11.access.a;

public class Computer {

    public String os ;
    protected int memory;
    String brand ;
    private boolean hasWifiCard;

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifiCard=" + hasWifiCard +
                '}';
    }
}
