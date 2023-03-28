package studyGroup;

public class arrayReverse {
    public static void main(String[] args) {

        String[] classMates = {"Akif", "Zainab", "Ziya", "Sabah", "Marah", "Husametin", "Yevgeniy", "Aynur", "Rachel", "Ross"};

        for (String classMate : classMates) {
            String str = "";
            for (int i = classMate.length() - 1; i >= 0; i--) {
                str += classMate.charAt(i);
            }
            System.out.println(str);
        }
    }
}
