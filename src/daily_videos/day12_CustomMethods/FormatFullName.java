package daily_videos.day12_CustomMethods;

public class FormatFullName {
    public static void main(String[] args) {
        String first = "cyDEo";
        String last = "SCHOOL";

        /*
            toUpperCase method is a string method.
        So we have to have a String to use String methods like .toUpperCase()
            but .charAt() returns a char and we can't combine with a String method !!
                    str.charAt().toUpperCase() ==> it won't work

                That's why I should use .substring(begins,ends(ecxlude)) to get a char.
                        for example to get the first char str.substring(0,1)


         */

        /*
                    .trim() method removes only the white space at the beginning and the end.
                            if we want to remove all of the spaces even between characters
                                        we have to use .replace() method !!
         */

        first = first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
                    // getting the first char(in upper case)  + the remaining characters of the first name in lower case
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " +last;
        System.out.println(fullName);

    }
}
