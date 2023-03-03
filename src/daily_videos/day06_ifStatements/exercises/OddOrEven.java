package daily_videos.day06_ifStatements.exercises;

public class OddOrEven {
    public static void main(String[] args) {

        /*
                 odd number : the number can't be divided by 2    without remainder
                 even number : the number can be divided by 2 without remainder
                             in other word the numbers that are evenly divisible by 2 (remainder zero)
         */
        int number = 75 ;

        boolean isEven = number % 2 == 0 ;
        boolean isOdd = !isEven;


        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);







    }
}
