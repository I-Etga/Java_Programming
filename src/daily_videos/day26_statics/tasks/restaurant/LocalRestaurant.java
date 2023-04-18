package daily_videos.day26_statics.tasks.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Tailor", "Mannheim", 3);

        String[] str = {
                "Ankara",
                "Istanbul",
                "Izmir"
        };

        int[] ints = {
                1,
                2,
                3,
        };

        Server server1 = new Server("Daniel", 123, 20, true);
        Server server2 = new Server("Ross", 49, 20, true);
        Server server3 = new Server("Rachel", 130, 20, false);

        Server[] servers = {
                server1,
                server2,
                server3
        };

        Server[] servers1 = {
                new Server("Daniel", 123, 20, true),
                new Server("Ross", 49, 20, true),
                new Server("Rachel", 130, 20, false)
        };

        restaurant.hireServer(servers);


        Chef[] chefs = {
                new Chef("Dan", 45, 40, true),
                new Chef("Isabel", 231, 60, true)
        };

        restaurant.hireChef(chefs);
        System.out.println(Arrays.toString(servers));
        System.out.println(Arrays.toString(chefs));

        System.out.println(restaurant);
    }
}

