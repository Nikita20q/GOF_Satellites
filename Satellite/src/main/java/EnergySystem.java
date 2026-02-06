public class EnergySystem {
    private double batteryLevel;

    private static final double LOW_BATTERY_THRESHOLD = 20.0;
    private static final double MAX_BATTERY = 100.0;
    private static final double MIN_BATTERY = 0;
    public double getBatteryLevel() {
        return batteryLevel;
    }

    public EnergySystem(double batteryLevel) {
        this.batteryLevel = Math.max(MIN_BATTERY ,batteryLevel);
    }

    public boolean consume(double amount) {
        if (amount <= 0 || batteryLevel <= MIN_BATTERY) {
            return false;
        }
        batteryLevel = Math.max(MIN_BATTERY, batteryLevel - amount);
        return true;
    }

    public boolean hasSufficientPower() {
        return batteryLevel > LOW_BATTERY_THRESHOLD;
    }
    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel > MAX_BATTERY) {
            this.batteryLevel = MAX_BATTERY;
        } else if  (batteryLevel < LOW_BATTERY_THRESHOLD) {
            this.batteryLevel = LOW_BATTERY_THRESHOLD;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }
    @Override
    public String toString() {
        return "EnergySystem{" + "batteryLevel=" + batteryLevel + '}';
    }
}
