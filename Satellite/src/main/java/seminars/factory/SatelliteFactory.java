package seminars.factory;

import seminars.Satellite;

abstract class SatelliteFactory {
    public abstract Satellite createSatellite(String name, double batteryLevel);
    public abstract Satellite createSatelliteWithParameter(String name, double batteryLevel, double parameter);
}
