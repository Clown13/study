package concurrent;
// Multithreading allows a program to execute multiple tasks simultaneously by dividing them to a smaller unit called threads.
// Benefits: Better performance(Parallel Execution), responsiveness, and concurrency (Helps handling multiple tasks at once).
class SampleThread extends Thread {
    public void run() {
        for (int i =0; i <5; i++) {
            System.out.println(Thread.currentThread().getName() + "is running" + i );
        }
    }
}
//Recommit. 
public class Multithreading{
    public static void main(String[] args) {
        SampleThread thread1 = new SampleThread();
        SampleThread thread2 = new SampleThread();

        thread1.start();
        thread2.start();
    }

}
