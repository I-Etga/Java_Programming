package utilities;

public class Library {

    public static void sleep(double seconds) throws InterruptedException {

        // throws means it is handled temporary. The exception is still there.
        try {
            Thread.sleep((long) (seconds * 1000L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
