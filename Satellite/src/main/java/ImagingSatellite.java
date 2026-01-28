public class ImagingSatellite extends Satellite {
    private double resolution;
    private int photosTaken;

    public double getResolution() {
        return resolution;
    }

    public int getPhotosTaken() {
        return photosTaken;
    }

    ImagingSatellite(String name, double resolution, EnergySystem energySystem,SatelliteState satelliteState) {
        this.energy = energySystem;
        this.state = satelliteState;
        this.name = name;
        this.resolution = resolution;
        energy.setBatteryLevel(100.0);
        System.out.println(String.format("Создан спутник: %s (заряд: %f%%)", name, energy.getBatteryLevel()));
    }

    @Override
    public void performMission() {
        if (state.isActive()) {
            takePhoto();
            consumeBattery(0.08);
            System.out.println(String.format("%s: Съемка территории с разрешением %.2f м/пиксель", name, resolution));
            System.out.println(String.format("%s: Снимок #%d сделан!", name, photosTaken));
        }
        else {
            System.out.println("🛑 " + name + ": Не может выполнить съемку - не активен");
        }
    }

    private void takePhoto() {
        photosTaken ++;
    }

    @Override
    public String toString() {
        return String.format("ImagingSatellite{resolution=%.2f, photosTaken=%d, name='%s', isActive=%b, batteryLevel=%.2f}", resolution, photosTaken, name, state.isActive(), energy.getBatteryLevel());
    }
}
