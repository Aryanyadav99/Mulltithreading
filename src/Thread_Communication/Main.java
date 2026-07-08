package Thread_Communication;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        Buffer bf=new Buffer();
        Producer p=new Producer(bf);
        Consumer c=new Consumer(bf);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("OPPPPPPP hogya");
    }

}
