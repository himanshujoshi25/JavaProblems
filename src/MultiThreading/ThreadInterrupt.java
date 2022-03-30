package MultiThreading;
public class ThreadInterrupt extends Thread{

    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("My Thread");
        }catch(InterruptedException e){
            throw new RuntimeException("Thread interrupted"+e);

        }
    }
    public static void main(String args[])
    {
        ThreadInterrupt t1=new ThreadInterrupt();
        t1.start();
        try
        {
            t1.interrupt();
        }catch(Exception e){
            System.out.println("Exception handled "+e);
        }
    }
}
