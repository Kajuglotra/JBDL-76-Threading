package threading;

public class Task implements Runnable{
    @Override
    public void run() {
        // whatever task u want to do in parallelism
        System.out.println("kajal with thread "+ Thread.currentThread().getName());
    }
}
