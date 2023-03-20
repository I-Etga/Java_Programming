package studyGroup;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str= "aabcccd";
        char ch = 'c';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i) ){
                frequency++;
            }
            System.out.println("i " + i + " chi " + str.charAt(i) + " freq " + frequency);
        }
        System.out.println(frequency);
    }
}
