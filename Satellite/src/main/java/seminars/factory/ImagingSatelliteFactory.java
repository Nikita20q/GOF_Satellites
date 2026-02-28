package seminars.factory;

import org.springframework.stereotype.Service;
import seminars.ImagingSatellite;
import seminars.Satellite;

@Service
public class ImagingSatelliteFactory extends SatelliteFactory {
    @Override
    public ImagingSatellite createSatellite(String name, double batteryLevel) {
        return new ImagingSatellite(name, batteryLevel, 0);
    }

    @Override
    public ImagingSatellite createSatelliteWithParameter(String name, double batteryLevel, double parameter) {
        return new ImagingSatellite(name, batteryLevel, parameter);
    }

}
