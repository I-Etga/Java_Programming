package daily_videos.day20_forEach.tasks;

public class  CountOfPolidrome {
    public static void main(String[] args) {

        String[] words = {"Anna", "level", "Java", "Ankna", "suus", "Izmzi", "New York"};

        int count = 0; //+1 +1
        //int nonPalidrome = words.length-count; // count 7-0

        for (String word : words) {

            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (word.equalsIgnoreCase(reverse)) {
                count++;
            }
        }
        //count = 5;
        int nonPalidrome = words.length-count; // 7-5
        System.out.println("Number of palindrome element: " + count + "\nNumber of non-palindrome element: " + nonPalidrome);
    }
}
/*
3. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
