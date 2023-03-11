package other.wednesday_office_hours.week05;

public class IndexOfExample {
    public static void main(String[] args) {

        String str = "definition";

        System.out.println("first i " + str.indexOf('i'));
        System.out.println("last i " + str.lastIndexOf('i'));

        System.out.println(str.indexOf('i',3));
        System.out.println(str.indexOf('i',4));

        int firstIndex = str.indexOf("i");
        int secondIndex = str.indexOf("i",firstIndex+1);
        int thirdIndex = str.indexOf("i",secondIndex +1);

    }
}
