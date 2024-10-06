package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorCountMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        VisitorCount visitorCount = new VisitorCount();

        for(int i=1;i<=20000;i++){
            service.submit(visitorCount);
        }

        service.shutdown();
        service.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("People Present in the hall is "+ visitorCount.getCount());
    }
}
