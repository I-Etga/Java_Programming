package daily_videos.day13_CustomMethodsContinue;

public class ReturnMethodsPractice {
    public static void main(String[] args) {


        int num = 200;

        if (isEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }


    }

    public static boolean isOdd(int num) {
        return (num % 2 != 0) ? true : false;
    }

    public static boolean isEven(int num) {
        return isOdd(num);
        //return (num %2 ==0)?true:false;
    }

}
