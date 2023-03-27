package studyGroup;

public class frequenceA1 {
    public static void main(String[] args) {
        String str = "aaabbccccddeeee";
        int highestFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > highestFrequency) {
                highestFrequency = count;
            }
        }
        // highestFrequency = 4;
        // String str = "aaabbccccddeeee";
        String result = "";
        String message = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            // a3-a3-a3-b2-b2-c4-c4-c4-c4-d2-d2-e4-e4-e4-e4
            if (count == highestFrequency && !result.contains(ch + "")) {
                result += ch + "\n";
            }
            if (!message.contains(ch + "")) {
                message += ch + "" + count;
            }
        }
        System.out.println(result);
        System.out.println(message);
    }
}
