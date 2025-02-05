package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTasktwo implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is executing...");
        try {
            Thread.sleep(1000);

        }catch(InterruptedException e){
            e.printStackTrace();

        }


    }
}

/***
 * This is used in web requests and database calls, when it has unpredictable task loads. Thread is destroyed when idle for 60 seconds.
 */
public class cachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool(); //cached Thread Pool.
        for (int i = 1; i <= 5; i++) {
            executor.execute(new MyTasktwo());
        }
        executor.shutdown();
    }
}
