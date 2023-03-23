package daily_videos.day19_Arrays;

public class MinNumber {
    public static void main(String[] args) {

        int[] numbers = {100,20,500,-10,30};

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min= " + min);
    }
}
