package studyGroup.march14;

public class PalindromeWithIf {

    /*
              this is basically how for loop works BUT ONLY IN THIS CASE !
            for (int i = str.length(); i >=0 ; i--) {
            reverse += str.charAt(i);
            }
     */
    public static void main(String[] args) {
        String str = "Anna";
        String reverse = "";
        int sequence = 0;
        int i = str.length() - 1;
        if (i == 3) {
            reverse += str.charAt(i);
            i--; //i =2                                             Anna Anka
            if (i == 2) {                           //for(i =3 ; i >=0 ; i--){ reverse += str.charAt(i);   }
                reverse += str.charAt(i);
                i--; //i=1
                if (i == 1) {
                    reverse += str.charAt(i);
                    i--; //i = 0
                    if (i == 0) {
                        reverse += str.charAt(i);
                    }
                }
            }
        }
        System.out.println(reverse);

        /*
                String reverse = ""; // a Reverse: annA
        for (int i = 3; i >= 0; i--) {
            reverse += str.charAt(i);
         */

        boolean isPalindrome = str.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);
    }
}
