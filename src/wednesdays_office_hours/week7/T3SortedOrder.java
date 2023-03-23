package wednesdays_office_hours.week7;

public class T3SortedOrder {
     /*
    T3SortedOrder [loop, String]
    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetically order
        return false if the given String is not sorted
    Ex:
        input: "abcd"
        output: true
        input: "abzy"
        output: false
     */

    // assuming we only want to check for the characters themselves, ignore case sensitivity
    public static boolean isSorted(String str){
        str = str.toLowerCase();

        for(int i = 0; i < str.length()-1; i++){

            if(str.charAt(i) > str.charAt(i + 1)){
                return false; //
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSorted("abcd"));
        System.out.println(isSorted("abznm"));
        System.out.println(isSorted("ejox"));
        System.out.println(isSorted("abcad"));
    }


}
