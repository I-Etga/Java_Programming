package daily_videos.day15_loopsContinue.practice;

public class RemoveDublicatesWContinue {

    public static void main(String[] args) {

        String str = "abcaabbdcced";
        String noDublicates="";
        for (int i = 0; i < str.length(); i++) {
            if(noDublicates.contains(""+str.charAt(i))){
                continue;
            }
            noDublicates +=str.charAt(i);
        }
        System.out.println(noDublicates);
    }
}
