package daily_videos.day16_nestedLoop.practice.tasks;

public class Stars {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j= i; j <= i; j++) {
                System.out.println("*".repeat(i));
            }
        }
    }
}