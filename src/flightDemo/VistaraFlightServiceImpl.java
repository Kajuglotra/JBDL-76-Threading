package flightDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VistaraFlightServiceImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date jDate) {
        List<FlightData> flightData = new ArrayList<>();
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.VISTARA, 6));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.VISTARA, 7));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.VISTARA, 8));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.VISTARA, 9));
        flightData.add(new FlightData(src, dest, jDate, 200, FlightProviders.VISTARA, 10));
        return flightData;
    }
}
