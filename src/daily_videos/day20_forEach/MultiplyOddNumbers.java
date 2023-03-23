package daily_videos.day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        int[] numbers = { 1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 ==0){
                continue;   // multiply only the even elements !!
            }

            numbers[i] = numbers[i]*2;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
