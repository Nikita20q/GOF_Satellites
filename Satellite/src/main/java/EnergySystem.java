public class EnergySystem {
    double batteryLevel;

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel > 100.0) {
            this.batteryLevel = 100.0;
        } else if  (batteryLevel < 0.0) {
            this.batteryLevel = 0.0;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }
}
