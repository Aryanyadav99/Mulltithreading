package Thread_Communication;

public class Buffer {
    private int item;
    private boolean avail=false;
    public synchronized void produce(int val) throws InterruptedException {
        while(avail){
            wait();
        }
        item=val;
        avail=true;
        System.out.println("Produced : " + item);
        notify();
    }
    public synchronized void consumer() throws InterruptedException {
        while(!avail){
            wait();
        }
        avail=false;
        System.out.println("Consumed : " + item);
        notify();
    }
}
