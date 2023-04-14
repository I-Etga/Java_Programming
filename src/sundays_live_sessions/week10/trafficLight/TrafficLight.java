package sundays_live_sessions.week10.trafficLight;

public class TrafficLight {
    private String color;

    public String getColor() {
        return color;
    }

    public TrafficLight(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow")) {
            this.color = color;
        } else {
            System.err.println("Color only can be one of those color: green, red , yellow");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "color='" + color + '\'' +
                '}';
    }
}
