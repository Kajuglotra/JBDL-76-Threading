package threading;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am going to know about threading");
        Task task = new Task();
        Thread thread = new Thread(task);
        Thread thread5 = new Thread(task);
        thread.start();
        thread5.start();

        Thread thread1 = new Task2();
        Thread thread2 = new Task2();
        Thread thread3 = new Task2();
        Thread thread4 = new Task2();

        thread1.start();
        thread2.start();
    }
}

// main is default thread created at the time of starting of execution
//Daemon, user thread
// 2 separate instances
// every instance u have separate main thread
// main thread is getting created from main method ?

// I want u to give me factorial of n nums in multi threaded pattern