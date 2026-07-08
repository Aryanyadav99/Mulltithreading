package Deadlocktest;

public class DeadlockDemo {

    static Object lockA = new Object();
    static Object lockB = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("t1 got lockA");
                synchronized (lockB) {
                    System.out.println("t1 got lockB");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("t2 got lockB");
                synchronized (lockA) {
                    System.out.println("t2 got lockA");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
// deadlock achieved :>
//t1 ne lockA le liya
//t2 ne lockB le liya
//t1 ab lockB maang raha hai — par wo t2 ke paas hai → t1 ruk gaya (wait)
//t2 ab lockA maang raha hai — par wo t1 ke paas hai → t2 bhi ruk gaya (wait)