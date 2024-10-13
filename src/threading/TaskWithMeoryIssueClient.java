package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public class TaskWithMeoryIssueClient {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        TaskWithMemoryConsistencyIssue issue1 = new TaskWithMemoryConsistencyIssue("W");
        TaskWithMemoryConsistencyIssue issue2 = new TaskWithMemoryConsistencyIssue("R");
        service.submit(issue1);
        service.submit(issue2);
        service.shutdown();
//        AtomicReference

    }
}
// atomic refe -> custom -> integer., flost
// eclipse -> creating a lib/jar -> importing
