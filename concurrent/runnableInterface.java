package concurrent;

class MyRunnable implements Runnable{
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName() + "- " + i);
            try{
                Thread.sleep(500);

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class runnableInterface {
    public static void main(String[] args) {

        startThreads();


    }
    public static void startThreads() {
        Thread t1 = new Thread(new MyRunnable(), "Worker-1"); //Create thread.
        Thread t2 = new Thread(new MyRunnable(), "Worker-2");
        t1.start();
        t2.start();
    }
}
