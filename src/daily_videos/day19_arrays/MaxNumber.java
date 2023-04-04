package daily_videos.day19_arrays;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100,20,500,-10,30};

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max= " + max);
    }
}
