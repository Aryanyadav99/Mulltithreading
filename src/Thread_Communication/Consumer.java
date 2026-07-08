package Thread_Communication;

import Synchronization.Counter;

public class Consumer implements Runnable{
    Buffer bf;
    Consumer(Buffer bf){
        this.bf=bf;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                bf.consumer();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
