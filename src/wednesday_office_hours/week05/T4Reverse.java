package wednesday_office_hours.week05;

public class T4Reverse {
    public static void main(String[] args) {

        String str = "hello";
        //THIS ONLY WORKS IF WE FIVE CHARACTERS WORD !!
        String reverse = "" + str.charAt(4) + str.charAt(3)
                + str.charAt(2) + str.charAt(1) + str.charAt(0);

        int index = str.length() - 1;
        String reverse1 = "" + str.charAt(index--) + str.charAt(index--)
                + str.charAt(index--) + str.charAt(index--)
                + str.charAt(index--);

        System.out.println(reverse);
        System.out.println(reverse1);
    }
}

/*
T4Reverse [String, index]

    Create a program that will have a String that is always 5 characters long. Reverse that given String and print the reverse version

    ex:
        input: hello
        output: olleh

        input: java
        output: avaj
 */