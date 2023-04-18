package daily_videos.day26_statics.tasks.restaurant;


import java.time.LocalDate;

public class ServerTest {

    public static void main(String[] args) {
        Server server1 = new Server("Lisa", 231, 20, true);

        System.out.println(server1);

        server1.takeOrder();
        server1.cleanTable();

        System.out.println(server1);

        Chef chef = new Chef("Ross", 321, 40, true);
        chef.makeOrder();
    }
}
