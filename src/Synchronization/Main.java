package Synchronization;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        Counter counter=new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);
        Thread t3=new Thread(t1);
        Thread t4=new Thread(t2);
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println(counter.getCount());// expected 2k but didn't get everytime because of race condition
        // critical section is increment and count++ is not atomic method so it produce race condtion
        // must have to use synchronized
    }

}
