package wednesdays_office_hours.week_12.app;

public class App {
    public String name;
    public double version;

    public App(String name, double version) {
        this.name = name;
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

