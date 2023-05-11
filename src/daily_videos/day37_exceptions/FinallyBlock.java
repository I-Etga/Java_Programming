package daily_videos.day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            //   System.exit(1); //if catch block gets executed, then finally block NOT !!
        } finally {
            System.out.println("Finally Block");
        }
        /*
        Finally Block is totally optional.
        If it has to be executed, we use finally block.
        It gets executed regardless there is exception or not

         */
    }
}

