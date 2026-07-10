package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {
    public static void main(String[] args) {
        // Executor Framework
        // create an thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // number of task = 5 perform on these 3 thread through the process queue+pool
        for(int i = 1; i<=5; i++) {
            int taskId = i;
            // .execute for the runnable interface
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is perfromed by " +
                        Thread.currentThread().getName());
            });
        }
        // must do shut down after use
        executor.shutdown();
    }
}
