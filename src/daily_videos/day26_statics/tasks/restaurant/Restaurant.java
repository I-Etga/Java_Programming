package daily_videos.day26_statics.tasks.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;

    public ArrayList<Server> servers ;
    public ArrayList<Chef> chefs ;


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeId) {
        chefs.removeIf(p -> p.employeeID == employeeId);
    }

    public void terminateServer(int employeeId) {
        servers.removeIf(p -> p.employeeID == employeeId);
    }
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
