package Deadlocktest;


public class Main {
    public static void main(String[]args) throws InterruptedException {
        MyThread t1=new MyThread();

        Thread t3=new Thread(t1);

        t3.start();

        t3.join();

        System.out.println("yoo");
        // cant able to get deadlock in this way because sync also use the reentrant lock
    }

}
