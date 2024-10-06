package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutoDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor1 = Executors.newCachedThreadPool();


    }
}
