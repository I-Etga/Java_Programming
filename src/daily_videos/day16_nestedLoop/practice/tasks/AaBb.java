package daily_videos.day16_nestedLoop.practice.tasks;

public class AaBb {
    public static void main(String[] args) {

        String result = "";
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (char chLowerC = 'a'; chLowerC <= 'z'; chLowerC++) {
                if (chLowerC == 'z') {
                    result += " "+ ch + chLowerC + "\n";
                } else {
                    result += " " + ch + chLowerC;
                }
            }
        }
        System.out.println(result);
    }
}
