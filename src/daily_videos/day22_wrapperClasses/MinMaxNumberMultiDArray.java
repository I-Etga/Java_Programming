package daily_videos.day22_wrapperClasses;

public class MinMaxNumberMultiDArray {

    public static void main(String[] args) {
        int [][] numbers = {{100,20,300},{10,1000,50},{-200,400,0}};

       /*   #1 Approach (We've learned and used that before !!)
       int min= 2147483647; // the largest int that could be given
        int max =-2147483648; // the smallest int that could be given*/

        // #2 Approach(new) (use one element of a 1D array as a reference value !)-[0][0]-

        int max = numbers[0][0];
        int min = numbers[0][0];


        for (int[] numbers1D : numbers) {
            for (int num : numbers1D) {
                if(num > max) {
                    max = num;
                }
                if(num <min){
                    min = num;
                }
            }
        }
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
    }
}
