import java.util.ArrayList;

public class SatelliteConstellation {
    String constellationName;
    ArrayList<Satellite> satellites = new ArrayList<>();

    SatelliteConstellation(String name) {
        constellationName = name;
        System.out.println("---------------------------------------------");
        System.out.println("Создана спутниковая группировка: " + constellationName);
        System.out.println("---------------------------------------------");
    }

    void addSatellite(Satellite satellite) {
        satellites.add(satellite);
        System.out.println(satellite.name + " добавлен в группировку " + "'" + constellationName + "'");
    }
    void executeAllMission() {
        for (var i : satellites) {
            i.performMission();
        }
    }
    ArrayList<Satellite> getSatellites() {
        return satellites;
    }
}