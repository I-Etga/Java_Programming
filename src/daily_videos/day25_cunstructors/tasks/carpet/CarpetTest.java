package daily_videos.day25_cunstructors.tasks.carpet;

public class CarpetTest {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(10.4,5,40,true);

        System.out.println(carpet);
        System.out.println(carpet.calcCost());
    }
}
