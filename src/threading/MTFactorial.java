package threading;

import java.math.BigInteger;

public class MTFactorial implements Runnable{

    private int num;

    public MTFactorial(int num){
        this.num = num;
    }
    @Override
    public void run() {
        getFactorial();
    }

    private void getFactorial(){
        BigInteger output = BigInteger.ONE;
        for(int i=2;i<=this.num;i++){
            output = output.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of the given num is done by thread "+ Thread.currentThread().getName() + " the value is "+output);
    }
}
