package flightDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirIndiaFlightServiceImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date jDate) {
        // database

        List<FlightData> flightData = new ArrayList<>();
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.AIR_INDIA, 1));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.AIR_INDIA, 2));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.AIR_INDIA, 3));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.AIR_INDIA, 4));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.AIR_INDIA, 5));
        return flightData;
    }
}
