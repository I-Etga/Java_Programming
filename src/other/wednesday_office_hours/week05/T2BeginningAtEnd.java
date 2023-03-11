package other.wednesday_office_hours.week05;

public class T2BeginningAtEnd {
    public static void main(String[] args) {

        String str = "JAAnkaraja";

        String begin = str.substring(0, 2).toLowerCase();
        System.out.println(str.substring(0, 2));
        System.out.println(str.toLowerCase().endsWith(begin));
    }
}
/*
T2BeginningAtEnd [String, indexes]

    -Create a program that will check;
    -if the first two characters of a given String are,
    also the last two characters of the String.
    -Print true if they are the same and false if they are not the same

    ex:
        educated -> true
        java -> false
        eraser for the computer -> true
        panda giftwrap -> false


 */
