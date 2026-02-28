package seminars.factory;

import org.springframework.stereotype.Service;
import seminars.CommunicationSatellite;
import seminars.ImagingSatellite;
import seminars.Satellite;

@Service
public class CommunicationSatelliteFactory extends SatelliteFactory {
    @Override
    public CommunicationSatellite createSatellite(String name, double batteryLevel) {
        return new CommunicationSatellite(name, batteryLevel, 0);
    }

    @Override
    public CommunicationSatellite createSatelliteWithParameter(String name, double batteryLevel, double parameter) {
        return new CommunicationSatellite(name, batteryLevel, parameter);
    }
}
