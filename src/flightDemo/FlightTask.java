package flightDemo;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

public class FlightTask implements Callable<List<FlightData>> {

    private String src;
    private String dest;
    private Date jDate;
    private FlightService flightService;

    public FlightTask(String src, String dest, Date jDate, FlightService flightService) {
        this.src = src;
        this.dest = dest;
        this.jDate = jDate;
        this.flightService = flightService;
    }

    @Override
    public List<FlightData> call() throws Exception {
        return flightService.getFlights(src, dest, jDate);
    }
}
