package daily_videos.day16_nestedLoop.practice;

public class FrequenceOfWord {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        while (sentence.contains(word)) {
            count++;
            sentence = sentence.replaceFirst(word, "");
        }
        System.out.println(count);

    }
}
