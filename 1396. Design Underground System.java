import java.util.*;

class UndergroundSystem {

    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class Travel {
        int totalTime;
        int trips;

        Travel() {
            totalTime = 0;
            trips = 0;
        }
    }

    HashMap<Integer, CheckIn> checkInMap;
    HashMap<String, Travel> travelMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        travelMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        CheckIn c = checkInMap.get(id);

        String key = c.station + "-" + stationName;

        int travelTime = t - c.time;

        Travel tr = travelMap.getOrDefault(key, new Travel());

        tr.totalTime += travelTime;
        tr.trips++;

        travelMap.put(key, tr);

        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String key = startStation + "-" + endStation;

        Travel tr = travelMap.get(key);

        return (double) tr.totalTime / tr.trips;
    }
}
