package concurrent;

class MyThread extends Thread{
    public void run(){
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }
}

//start() launches the thread in parallel.
//the run() method contains the code executed in the new thread.
public class basicThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();// Create thread object
        t1.start(); //Start the thread.

    }
}
