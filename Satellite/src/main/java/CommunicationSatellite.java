public class CommunicationSatellite extends Satellite{
    private double bandWidth;
    public double getBandWidth() {
        return bandWidth;
    }

    CommunicationSatellite(String name, double bandWidth, EnergySystem energySystem, SatelliteState satelliteState) {
        this.energy = energySystem;
        this.state = satelliteState;
        this.name = name;
        this.bandWidth = bandWidth;
        energy.setBatteryLevel(100.0);
        System.out.println(String.format("Создан спутник: %s (заряд: %f%%)", name, energy.getBatteryLevel()));
    }

    @Override
    protected void performMission() {
        if (state.isActive()) {
            sendData(bandWidth);
            consumeBattery(0.05);
        } else {
            System.out.println("🛑 " + name + ": Не может выполнить передачу данных - не активен");
        }
    }

    private void sendData(double data) {
        if (state.isActive()) {
            System.out.println(String.format("%s: Передача данных со скоростью %.2f Мбит/с", name, data));
            System.out.println(String.format("%s: Отправил %.2f Мбит данных!", name, data));
        }
    }

    @Override
    public String toString() {
        return String.format("CommunicationSatellite{bandwidth=%.2f, name='%s', isActive=%b, batteryLevel=%.2f}", bandWidth, name, state.isActive(), energy.getBatteryLevel());
    }
}
