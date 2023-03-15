package daily_videos.day16_nestedLoop;

public class NestedLoopsIntro {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("------- ** Results are identical ** ------\n");

        for (int i = 0; i < 5; i++) { // outer loop
            for (int j = 0; j < 5 ; j++) { //inner loop
                System.out.println("Wooden Spoon");
            }
        }
    }
}
