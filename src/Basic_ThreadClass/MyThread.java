package Basic_ThreadClass;

public class MyThread extends Thread{
    // to gave thread a name pass to constructor
    MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
//        for(int i=0;i<1000;i++){
//            System.out.println("MICCKKYY MOUSEEEEY");
//        }
        // for join test
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+i);
            //Thread.yield();
        }
    }
}
