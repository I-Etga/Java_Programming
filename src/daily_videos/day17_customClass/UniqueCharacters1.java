package daily_videos.day17_customClass;

public class UniqueCharacters1 {
    public static void main(String[] args) {
        String str =   "aabccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            // first occurance and last occurance is the same index. So unique!
            if(str.indexOf(each) == str.lastIndexOf(each)){
                unique+= each;
            }
        }
        System.out.println();
    }
}
