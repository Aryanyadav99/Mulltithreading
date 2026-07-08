package ExplicitLock;


import Deadlocktest.MyThread;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        Bank b=new Bank();
        Runnable run=new Runnable() {
            @Override
            public void run() {
                b.test();
            }
        };
        Thread t1=new Thread(run,"Dholu");
        Thread t2=new Thread(run,"Bholu");


        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("yoo");
    }

}
