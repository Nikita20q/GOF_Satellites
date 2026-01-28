import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("ЗАПУСК СИСТЕМЫ УПРАВЛЕНИЯ СПУТНИКОВОЙ ГРУППИРОВКОЙ");
        System.out.println("============================================================");
        System.out.println("СОЗДАНИЕ СПЕЦИАЛИЗИРОВАННЫХ СПУТНИКОВ:");
        System.out.println("---------------------------------------------");

        ImagingSatellite iS1 = new ImagingSatellite("Связь-1", 500.0, new EnergySystem(), new SatelliteState());
        ImagingSatellite iS2 = new ImagingSatellite("Связь-2", 1000.0, new EnergySystem(), new SatelliteState());
        CommunicationSatellite cS1 = new CommunicationSatellite("ДЗЗ-1", 500.0, new EnergySystem(), new SatelliteState());
        CommunicationSatellite cS2 = new CommunicationSatellite("ДЗЗ-2", 1000.0, new EnergySystem(), new SatelliteState());
        CommunicationSatellite cS3 = new CommunicationSatellite("ДЗЗ-3", 1500.0, new EnergySystem(), new SatelliteState());
        cS3.setBatteryLevel(15);
        SatelliteConstellation mission = new SatelliteConstellation("RU Basic");
        System.out.println("ФОРМИРОВАНИЕ ГРУППИРОВКИ:");
        System.out.println("---------------------------------------------");
        mission.addSatellite(iS1);
        mission.addSatellite(iS2);
        mission.addSatellite(cS1);
        mission.addSatellite(cS2);
        mission.addSatellite(cS3);
        System.out.println("-----------------------------------");
        System.out.println(mission.getSatellites());
        System.out.println("-----------------------------------");
        System.out.println("АКТИВАЦИЯ СПУТНИКОВ:");
        System.out.println("-----------------------------------");
        for (var i : mission.getSatellites()) {
            i.activate();
        }

        System.out.println("==================================================");
        System.out.println("ВЫПОЛНЕНИЕ МИССИЙ ГРУППИРОВКИ " + mission.constellationName);
        System.out.println("==================================================");
        mission.executeAllMission();
        System.out.println(mission.getSatellites());
    }
}
