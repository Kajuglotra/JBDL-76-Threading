package threading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// single threaded prog
public class FactorialDemo {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(10000,20000,30000,40000,50000,60000,70000,80000,90000,100000);
        List<Integer> list = Arrays.asList(1,2,3);
        Long startTime = System.currentTimeMillis();
        list.stream().map(item -> getFactorial(item)).forEach(item -> System.out.println("Factorial of the given num is done by thread "+ Thread.currentThread().getName() + " the value is " + item));
        Long endTime = System.currentTimeMillis();
        System.out.println("total Time is " +(endTime-startTime));
    }

    public static BigInteger getFactorial(int num){
        BigInteger output = BigInteger.ONE;
        for(int i=2;i<=num;i++){
            output = output.multiply(BigInteger.valueOf(i));
        }
        return  output;
    }

}
// main: 10 sec
// multi threaded : 9 sec (print the value )
// 8 thread :  6 sec

// 10 thread : 6 sec