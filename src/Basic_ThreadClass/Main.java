package Basic_ThreadClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread("Aryan");
        //t1.start(); // create thread t1 and auto call the run method

//        for(int i=0;i<1000;i++){
//            Thread.sleep(1000); // sleep for 1 second .. hold the execution for 1000 sec -> Thread enter into TIMED_WAITING state ..
//            System.out.println("DORAEMOOOOONNNNNN");
//        }



//        t1.join(); // jab tak t1 thread complete nhi ho jata tab tak main thread Waiting me chala jayega
//        // jo call karta hai vo wait karta hai yaha main  se t1.join call laga to main wait karega
//        System.out.println(Thread.currentThread().getName());


        // ab dekhte hai priority , name , current thread ye sab
        MyThread t2=new MyThread("Dholu");
        MyThread t3=new MyThread("Bholu");

        t1.setName("Kalia");
//        t1.setPriority(Thread.MAX_PRIORITY); // 10
//        t2.setPriority(Thread.MIN_PRIORITY); // 1
//        t3.setPriority(Thread.NORM_PRIORITY); // 5

        t1.start();
        t2.start();
        t3.start();
        // imp - setPriority just gave the hint to OS so it may or may not follow the priority of thread to execute first
        // interrupt method is used to interrupt the thread from the current state


        //Yield
//        Thread.yield() ka matlab hota hai:
//        "Bhai agar koi aur same ya higher priority wala thread ready hai, to tu pehle chal le. Main thoda side ho jata hu."
//        Ye CPU leave ki request hai, order nahi
//        in yield thread go from Running → Runnable not in sleep

    }
}
// Dekh MM to turant mili second me print ho jayega but jab D ki bar aayegi to har iteration me 1 sec ka sleep yahi approax 1k sec lagega print hone me sabhi D ko

// Main thread, User Thread, Daemon Thread .
// Daemon Thread are the background threads and the Jvm didn't wait it to fully complete