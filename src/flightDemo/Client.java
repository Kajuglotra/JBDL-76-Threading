package flightDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        List<FlightService> flightServiceList = new ArrayList<>();
        FlightService service1 = new AirIndiaFlightServiceImpl();
        FlightService service2 = new VistaraFlightServiceImpl();
        FlightService service3 = new IndigoFlightServiceImpl();
        flightServiceList.add(service1);
        flightServiceList.add(service2);
        flightServiceList.add(service3);
        ExecutorService service = Executors.newFixedThreadPool(flightServiceList.size());

//        FlightTask task1= new FlightTask("delhi", "mumbai", new Date(), service1);
//        FlightTask task2= new FlightTask("delhi", "mumbai", new Date(), service2);
//        FlightTask task3= new FlightTask("delhi", "mumbai", new Date(), service3);

        List<Future<List<FlightData>>> result  = flightServiceList.stream().map(s -> {
            FlightTask task= new FlightTask("delhi", "mumbai", new Date(), s);
            return service.submit(task);
        }).collect(Collectors.toList());
        service.shutdown();

        result.stream().forEach(d -> {
            try {
                System.out.println(d.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
// do the same thing in a single thread -> calculate time
// multi threaded
// volatile
// notify, notifyall
// logger (singleton )
