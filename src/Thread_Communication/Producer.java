package Thread_Communication;


public class Producer implements Runnable{
    Buffer bf;
    Producer(Buffer bf){
        this.bf=bf;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                bf.produce(i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
