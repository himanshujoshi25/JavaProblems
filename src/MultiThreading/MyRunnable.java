package MultiThreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        MyRunnable ex = new MyRunnable();
        Thread t1= new Thread(ex);
        t1.start();
        System.out.println("Hi");
    }
}
