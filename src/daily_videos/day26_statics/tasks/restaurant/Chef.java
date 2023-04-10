package daily_videos.day26_statics.tasks.restaurant;

import java.time.LocalDate;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder() {
        System.out.println(name + " is making an order");
    }

    public void washDishes() {
        System.out.println(name + " is washing the dishes");
    }

    public String fullTime(boolean fullTime) {
        String message = "";
        if (fullTime) {
            message = "Full-Time";
        } else {
            message = "Part-Time";
        }
        return message;
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime(fullTime) +
                '}';
    }

}
