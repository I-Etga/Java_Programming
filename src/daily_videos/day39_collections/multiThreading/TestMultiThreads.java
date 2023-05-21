package daily_videos.day39_collections.multiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {
/*

        ThreadHelloWorld thread1 = new ThreadHelloWorld();
        ThreadHelloWorld thread2 = new ThreadHelloWorld();
        ThreadHelloWorld thread3 = new ThreadHelloWorld();
        ThreadHelloWorld thread4 = new ThreadHelloWorld();
        ThreadHelloWorld thread5 = new ThreadHelloWorld();

        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();

        // If you run the code, you'll see that line 14,15,16,17,18 gets executed at the same exact time !!
*/

        // I create a variable named ThreadNumber and a constructor with int parameter named threadNumber,
        // I can initialize this variable through constructor.So I can ≈see the executing flow.


        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


/*


What if we call run method only ?
All the threads won't get executed in one time if we call RUN method. Threads gets executed after previous thread got executed COMPLETELY !!
If I modified my run method with "i", it shows in which order and how threads get executed !!
So if I want to thread get executed at the same exact time concretely, I have to call start() method.
If we call start method, run method gets executed as well.
 */
        // btw , we can create own custom thread class. 1# Thread Class 2# Runnable interface
    }
}
