package MultiThreading;
public class ThreadIsInterruptedExample extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Task is running " + i);
        }
    }

    public static void main(String args[])throws InterruptedException
    {
        ThreadIsInterruptedExample t1= new ThreadIsInterruptedExample();
        ThreadIsInterruptedExample t2= new ThreadIsInterruptedExample();

        t1.start();
        t2.start();
        System.out.println("Is thread interrupted? : "+t1.isInterrupted());
        System.out.println("Is thread interrupted? : "+t2.isInterrupted());
        // interrupt thread t1
        t1.interrupt();
        System.out.println("Is thread interrupted? : "+t1.isInterrupted());
        System.out.println("Is thread interrupted? : "+t2.isInterrupted());
    }
}