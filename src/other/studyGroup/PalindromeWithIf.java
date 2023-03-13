package other.studyGroup;

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
        int i = str.length() - 1;
        if (i == 3) {
            reverse += str.charAt(i);
            i--;
            if (i == 2) {
                reverse += str.charAt(i);
                i--;
                if (i == 1) {
                    reverse += str.charAt(i);
                    i--;
                    if (i == 0) {
                        reverse += str.charAt(i);
                    }
                }
            }
        }
        System.out.println(reverse);

        boolean isPalindrome = str.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);
    }
}
