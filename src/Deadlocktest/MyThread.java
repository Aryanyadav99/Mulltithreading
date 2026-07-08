package Deadlocktest;

import Synchronization.Counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable{

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName()+" got lock");
        inner();
    }
    public synchronized void inner(){
        System.out.println(Thread.currentThread().getName()+" got lock");
    }
}
