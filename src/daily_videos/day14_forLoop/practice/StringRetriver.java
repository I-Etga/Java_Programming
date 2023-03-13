package daily_videos.day14_forLoop.practice;

public class StringRetriver {
    public static void main(String[] args) {

        retriver("mn@#123Ab!");

    }

    public static void retriver(String str){
        String letters= "letters: ";
        String specialChars= "special characters: ";
        String digits= "digits: ";

        for (int i = 0; i <str.length()-1 ; i++) {
            char ch = str.charAt(i);
            if(ch >='a' && ch<='z' || ch >='A' && ch<='Z' ){
                letters += ch;
            }else if(ch >='0' && ch<='9' ){
                digits += ch;
            }else{
                specialChars += ch;
            }
        }
        System.out.println(letters+"\n"+digits+"\n"+ specialChars);
    }
}
/*
                    this method is really important.
                    with the relational operators we can use char as if it's a number.
                     'a' >= 'c' --> false !! Think of like that !!

 */