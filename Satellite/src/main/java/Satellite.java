abstract public class Satellite {

    protected String name;
    protected SatelliteState state = new SatelliteState();
    protected EnergySystem energy = new EnergySystem();

    public boolean activate() {
        if (energy.getBatteryLevel() > 20) {
            System.out.println("✅ " + name + ": Активация успешна");
            state.setActive(true);
            return true;
        }
        else {
            System.out.println(String.format("\uD83D\uDED1 %s: Ошибка активации (заряд: %.2f%%)", name, energy.getBatteryLevel()));
            return false;
        }
    }

    void setBatteryLevel(double batteryLevel)
    {
        System.out.println("Уровень заряда спутника: " + name + " изменён с " + energy.getBatteryLevel() + "% на " + batteryLevel + "%");
        energy.setBatteryLevel(batteryLevel);
    }

    public void deactivate() {
        if (state.isActive()) {
            state.setActive(false);
            System.out.println("🛑 " + name + ": Деактивация успешна");
        }
    }
    public void consumeBattery(double charge) {
        double currentBattery = energy.getBatteryLevel();
        energy.setBatteryLevel(currentBattery - charge);
        if (energy.getBatteryLevel() < 20) deactivate();
    }

    public String getName() {
        return name;
    }

    abstract protected void performMission();
}