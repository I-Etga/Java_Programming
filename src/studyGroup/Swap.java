package studyGroup;

public class Swap {
    public static void main(String[] args) {
        System.out.println(swap("ANKARA06"));
    }
    public static String swap (String str) {

        String first = "" + str.charAt(0);
        String last = "" + str.charAt(str.length() - 1);
                                        // str.lastIndexOf(last)
        String middle = str.substring(1,str.length()-1);

        //str = last + middle+ first;
        // return str;      (returns are identical)
        return last + middle+ first;

    }
}

/*
T2SwapFirstLast [methods, String]

    Create a method that has a String parameter and returns a String with the first and last character swapped

    Ex:
        code -> eodc
        ab -> ba
        fa -> af

 */