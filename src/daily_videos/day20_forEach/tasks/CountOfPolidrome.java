package daily_videos.day20_forEach.tasks;

public class CountOfPolidrome {
    public static void main(String[] args) {

        String[] words = {"anna", "level", "Java", "Ankna", "suus", "Izmzi", "New York"};

        int count = 0;
        int nonPalidrome = 0;

        for (String word : words) {
            //anna
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (word.equalsIgnoreCase(reverse)) {
                count++;
            } else {
                nonPalidrome++;
            }
        }
        System.out.println("Number of palindrome element: " + count + "\nNumber of non-palindrome element: " + nonPalidrome);
    }
}
