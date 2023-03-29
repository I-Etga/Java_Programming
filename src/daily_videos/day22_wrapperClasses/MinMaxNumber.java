package daily_videos.day22_wrapperClasses;

public class MinMaxNumber {

    public static void main(String[] args) {
        int [][] numbers = {{100,20,300},{10,1000,50},{-200,400,0}};

        int min= 2147483647;
        int max =-2147483648;

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
