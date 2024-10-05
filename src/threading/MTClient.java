package threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MTClient {
    public static void main(String[] args) throws InterruptedException {
        Long startTime = System.currentTimeMillis();
//        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> list = Arrays.asList(10000,20000,30000,40000,50000,60000,70000,80000,90000,100000);
        List<Thread> threadList = new ArrayList<>();

        for(int i=0;i< list.size();i++){
            MTFactorial mtFactorial = new MTFactorial(list.get(i)); // runnable object
            Thread thread = new Thread(mtFactorial);
            thread.start();
            threadList.add(thread);
        };
        for(int i=0;i<threadList.size();i++){
            threadList.get(i).join();
        }

//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
        Long endTime = System.currentTimeMillis();

        System.out.println("total Time is " +(endTime-startTime));
    }
}
// join
// start all the threads first
// joining