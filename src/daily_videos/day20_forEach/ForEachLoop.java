package daily_videos.day20_forEach;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] numbers = { 10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("------------");

        for(int each : numbers){
            System.out.println(each);
            /*
            We can not change order and number of the for each loop. // no infinite loop possibility !!
            However, we can change in for and while loop order and number or iteration!!

            Also, there is no index number to use in for each loop.
            It starts from the first elements until last elements to turn !!
             */
        }

    }
}
