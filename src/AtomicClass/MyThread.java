package AtomicClass;


public class MyThread implements Runnable{
    Counter c1;
    MyThread(Counter c1){
        this.c1=c1;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            c1.increment();
        }
    }
}
