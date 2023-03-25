package daily_videos.day20_forEach.tasks;

public class CountEvenOrOdd {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,12,14,16,18,20,13,15,17};

        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int number : numbers) {
            if(number %2 == 0){
                evenNumbers++;
            }else{
                oddNumbers++;
            }
        }

        System.out.println("Number of even numbers= " + evenNumbers + "\nNumber of odd numbers= " + oddNumbers);


    }
}
