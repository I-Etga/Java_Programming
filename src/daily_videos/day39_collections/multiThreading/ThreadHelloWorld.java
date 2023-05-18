package daily_videos.day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {

    // Run method implicitly gets executed whenever we call start method.
    // Every single thread has run method. When we call the start method, run method gets executed.

    int threadNumber ;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World Thread " + threadNumber);
            try {
                // it's an overridden method. the signature has to be the same as original methods.
                // That's why I can't use throws. I've used here try/catch block
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
