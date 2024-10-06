package threading;

import java.util.concurrent.Callable;

public class TaskWithCallable implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "I am in call method";
    }
}
