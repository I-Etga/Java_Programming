package daily_videos.day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {

        String name = "Ermek Kenesbehakovnic Apozov";
        String result = reverse(name);
        System.out.println(result);
    }
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}

