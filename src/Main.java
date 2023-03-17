
public class Main {
    public static void main(String[] args) {

    String str1 = "abc";
    String str2 = "abc";
    String str3 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println("str1 == str2: " + str1==str2);
                                                    // "+" > "=="
                                            //according to precedence of the operators + has priority to ==
                            // ("str1 == str2: "+ str1) == str2
                            // "str1 == str2: abc" == abc
                                // false

        // equals but not == ---> str3 != str2 str3.equals(str1)
        // == --> equals

        System.out.println("str1 == str2: " +( str1==str2));


        int s= 5;
        int t =10;
        for(; s < t; s++){
            System.out.println(s);
        }

    }
}