package nevader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Runnable> runnables = new ArrayList<>();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        };


        Runnable runnabl2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        };

        runnables.add(runnable);
        runnables.add(runnabl2);


        MultiExecutor multiExecutor = new MultiExecutor(runnables);
        multiExecutor.executeAll();
        System.out.println("Hello world!");
    }
}