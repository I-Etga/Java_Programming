package wednesdays_office_hours.week8;

import utilities.ArraysUtility;
import java.util.Arrays;

public class T1ShiftLeft {
    public static void main(String[] args) {
        
        int [] numbers = {17,14,5,10};

        int[] numbersNew = new int[numbers.length]; //{14,5,10,17}

        for (int i = 0; i < numbers.length; i++) {
            if(i == 0){
                numbersNew[numbers.length-1] = numbers[i]; // numbersNew[4-1] = numbers[0]
            } else{
                numbersNew[i-1] = numbers[i]; // numbersNew[0] =numbers[1]
            }
        }
        System.out.println(Arrays.toString(numbersNew));
    }
}

