package MultiThreading;

public class ThreadNames implements Runnable{

    public static void main(String[] args) {
        Thread Thread1 = new Thread("Thread1");
        Thread Thread2 = new Thread("Thread2");
        Thread1.start();
        Thread2.start();
        System.out.println("Thread names are following:");
        System.out.println(Thread1.getName());
        System.out.println(Thread2.getName());
    }
    @Override
    public void run() {
    }

}
