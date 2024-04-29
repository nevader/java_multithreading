package nevader;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {


    private List<Runnable> task;
    // Add any necessary member variables here

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        this.task = tasks;
        // Complete your code here
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {

        List<Thread> threads = new ArrayList<>(task.size());

        for (Runnable runnable : task) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
        }


        for (Thread thread : threads) {
            thread.start();
        }


    }
}