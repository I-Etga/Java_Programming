package wednesdays_office_hours.week6;

public class SwapFirstLast {
    public static void main(String[] args) {

        System.out.println(swapFirstLast("AbcdeF"));

    }

    public static String swapFirstLast(String str){

        String firstLast = "";

        String first = "" + str.charAt(0);
        // String first = str.substring(0,1)

        String last = "" + str.charAt(str.length()-1);
        // String last = str.substring(str.length()-1);

        firstLast = first + last;
        firstLast = "" + str.charAt(0) + str.charAt(str.length()-1);

        return firstLast;
    }
}


/*
T2SwapFirstLast [methods, String]

    Create a method that has a String parameter and returns a String with the first and last character swapped

    Ex:
        code -> eodc
        ab -> ba
        fa -> a

 */