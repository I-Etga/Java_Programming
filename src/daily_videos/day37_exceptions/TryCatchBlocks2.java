package daily_videos.day37_exceptions;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[1000]);
        } catch (RuntimeException e) {
            e.printStackTrace(); //displays full details of the exception after the executing of program
            System.out.println(e.getMessage()); // it gives only the excepsion message. No details
        }

        System.out.println("Program1 ended");

        System.out.println("- - - - ");

        System.out.println("Program2 started");

        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            e.printStackTrace();

        }

        System.out.println("Program2 ended");

    }
}
