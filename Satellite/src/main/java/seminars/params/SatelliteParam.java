package seminars.params;

import seminars.enums.SatelliteType;

public class SatelliteParam {
    SatelliteType type;
    String name;
    double batteryLevel;

    public SatelliteParam(SatelliteType type,  String name, double batteryLevel) {
        this.type = type;
        this.name = name;
        this.batteryLevel = batteryLevel;
    }
    public SatelliteType getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public double getBatteryLevel() {
        return batteryLevel;
    }
}
