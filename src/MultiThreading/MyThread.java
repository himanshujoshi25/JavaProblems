package MultiThreading;

public class MyThread extends Thread{

    public void run(){
        System.out.println("My thread is running...");
    }
    public static void main(String args[]){
        MyThread t1=new MyThread();
        t1.start();
        System.out.println("Hello");
    }
}


