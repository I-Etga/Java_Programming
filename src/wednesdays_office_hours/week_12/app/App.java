package wednesdays_office_hours.week_12.app;

public class App {
    public String name;
    public double version;

    public App( double version) {
        this.name = getClass().getSimpleName(); // constructor does not accept that statement. So We initialize it that way.
        this.version = version;
    }

    public void download() {
        System.out.println(name + " is downloading version: " + version);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "version=" + version +
                '}';
    }
}

