package other.studyGroup;

public class Palindrome {
    public static void main(String[] args) {
        boolean a = palindrome("Izmir");
        System.out.println(a);

        //System.out.println(palindrome("Anna"));
    }

    public static boolean palindrome(String str) {
        String reverse = ""; // a Reverse: annA
        // 3a 2n 1n 0A
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            /*
            reverse = ""+'a+'n'+'n'+'A'
            reverse = "annA";
             */
            /*
            String reverse= "";
            if(i == 3){
            reverse += str.charAt(i);
            }
            if(i==2){
           reverse += str.charAt(i);}
           if(i == 1){
            reverse += str.charAt(i);
            }
            if(i == 0){
            reverse += str.charAt(i);
            }

             */



        }

        boolean isPalindrome = str.equalsIgnoreCase(reverse);
        return isPalindrome;
    }

}
