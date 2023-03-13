package daily_videos.day15_LoopsContinue;
public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i < 6 ; i++) {
            if(i == 2 ){
                /* Because of continue, it prints 1,3,4,5.
                So, only 2 is not printed. Before and After continue got executed.

                If I write break instead of continue, It will print only 1 !!
                Because after break, loop will be terminated!!
                 */
                continue;
            }
            System.out.println(i);
        }
    }
}
