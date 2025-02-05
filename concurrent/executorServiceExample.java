package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is executing task...");
        try {
            Thread.sleep(1000); //Simulate work

        }catch(InterruptedException e){
            e.printStackTrace();

        }
    }
}

public class executorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); //Create worker threads with fixed number

        for (int i = 1; i <= 4; i++) {
            executor.execute(new MyTask()); // Submitting tasks to the executor.

        }
        executor.shutdown(); //Stops accepting new tasks, finishes existing ones.
    }
}
