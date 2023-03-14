package daily_videos.day15_loopsContinue.practice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbcdeac";
        String nonDublicated = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nonDublicated.contains("" + str.charAt(i))) {
                nonDublicated += str.charAt(i);
            }
        }
        System.out.println(nonDublicated);
    }
}
