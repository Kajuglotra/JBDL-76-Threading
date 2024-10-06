package threading;

import java.util.concurrent.atomic.AtomicInteger;

public class TaskWithMemoryConsistencyIssue implements Runnable {

    private String type;
    private static int data =0;

    public TaskWithMemoryConsistencyIssue(String type){
        this.type=type;
    }
    @Override
    public void run() {
        if(type.equalsIgnoreCase("W")){
            while (data !=5){
                data++;
                System.out.println( "wrote data :"+ data);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }else{
            int temp = 0;
            while(true){
                if(temp != data){
                    System.out.println("read data : "+ data);
                    temp = data;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

// threads 2
// W -> writing the data
// data is a shared variable

// R -> reading the data
