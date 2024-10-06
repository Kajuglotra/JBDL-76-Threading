package flightDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndigoFlightServiceImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date jDate) {
        List<FlightData> flightData = new ArrayList<>();
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.INDIGO, 11));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.INDIGO, 12));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.INDIGO, 13));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.INDIGO, 14));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.INDIGO, 15));
        return flightData;
    }
}
