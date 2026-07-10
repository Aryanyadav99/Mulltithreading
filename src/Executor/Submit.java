package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Submit {
    public static void main(String[] args) {
        // Future and Callable

        ExecutorService executor = Executors.newFixedThreadPool(3);
        // in submit we are using callable interface which return value after process and same as runnable but have call method instead of run
        // we are using Future<Integer> instead of normal Integer because let say thread gonna interrupt or send in waiting area but normal mem need instant result or store null but here it promise i will send the value in future
        Future<Integer> f1 = executor.submit(() -> {
            try {
                Thread.sleep(3000);
            }
            catch(Exception e) {}

            return 30;
        });

        try {
            System.out.println(f1.get());
        }
        catch(Exception e) {}

    }
}
