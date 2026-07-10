package AtomicClass;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    // instead of sync the increment just make the count as atomic and use the atomic methods
    private AtomicInteger count=new AtomicInteger(0);
    public  void increment(){
        count.incrementAndGet();
    }
    public int  getCount(){
        return count.get();
    }
}
