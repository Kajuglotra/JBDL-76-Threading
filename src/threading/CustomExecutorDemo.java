package threading;

import java.util.concurrent.*;

public class CustomExecutorDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor
                (3, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(200));

//        Task task = new Task();
        TaskWithCallable task  = new TaskWithCallable();
        for(int i=0;i<200;i++) {
            executor.submit(task);
        }
        Future<String> out = executor.submit(task); // not a blocking call
        System.out.println();
        System.out.println();

        System.out.println(out.get());



       // blocking // timeout
//        executor.shutdownNow();
        executor.shutdown(); // signal that after this shutdown, you can not submit one more task
        executor.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("I am in main");
    }
}
// friend of urs
// his mother is not well
// give me your debit card
// u do not have money in bank account
// u need it for your mother
// take the card, go to hosp
// pay the bill, my card has some money in it
