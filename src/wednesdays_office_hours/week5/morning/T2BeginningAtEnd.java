package wednesdays_office_hours.week5.morning;

public class T2BeginningAtEnd {
    /*
    T2BeginningAtEnd [String, indexes]

	Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false

     */
    public static void main(String[] args) {

        String str = "eraser for the computer";

        String begin = str.substring(0,2);
        System.out.println(str.endsWith(begin));

    }
}
