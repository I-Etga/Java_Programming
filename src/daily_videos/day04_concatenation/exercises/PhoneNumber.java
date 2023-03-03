package daily_videos.day04_concatenation.exercises;

public class PhoneNumber {
    public static void main(String[] args) {

        /*
         In this case it doesn't matter whether String or int.
         Because between the values there are String.
         If not we would have to use String in any case. Other this would be addition in Math.
         */
        int countryCode = 1;
        int areaCode = 703;
        int localNumber = 4512625;

        System.out.println("+"+countryCode + "(" + areaCode + ")" + "-" + localNumber);
    }
}
