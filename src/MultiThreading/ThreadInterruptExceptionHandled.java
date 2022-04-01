package MultiThreading;
public class ThreadInterruptExceptionHandled extends Thread{

    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("task");
        }catch(InterruptedException e){
            System.out.println("Exception Handled "+e);
        }
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadInterruptExceptionHandled t1 = new ThreadInterruptExceptionHandled();
        t1.start();
        t1.interrupt();
    }
}
