package daily_videos.day15_LoopsContinue.practice.self;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "aabcccdeefgg";
        char ch = 'a';

        int i = 0;
        int charSequences = 0;

        while(i<str.length()){
            if(str.charAt(i) == ch){
                charSequences++;
            }
            i++;
        }
        System.out.println(charSequences);
    }
}
