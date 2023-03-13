package wednesdays_office_hours.week5.morning;

public class T1GoodString {
    /*
    T1GoodString [String, indexes]

	Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false

	ex:
		goodday --> false
		agoodmovie --> true
		nogoodtoday -> true
		notgoodfornow -> false
     */
    public static void main(String[] args) {

        String str = "day";

        // approach 1
        String posOne = str.substring(1); // gives the String without the first character
        String posTwo = str.substring(2); // gives the String without the first two characters
        System.out.println(posOne.startsWith("good") || posTwo.startsWith("good"));

        // approach 2
        int index = str.indexOf("good");
        System.out.println(index == 1 || index == 2);

    }
}
