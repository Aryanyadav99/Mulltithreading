package AtomicClass;


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
        System.out.println(counter.getCount());
    }

}
