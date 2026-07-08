package ExplicitLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank{
    Lock lock=new ReentrantLock();
    public void test() {
        try{
            if(lock.tryLock()) { // if lock is free it capture else return false instant
                //lock.tryLock(1000,java.util.concurrent.TimeUnit.MILLISECONDS); // if lock is free  it instant capture else wait for 1 sec to free capture else return false
                System.out.println(Thread.currentThread().getName() + " got lock");
                Thread.sleep(2000);
            }
            else{
                System.out.println(Thread.currentThread().getName() + " unable to get lock");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }

    }

}
