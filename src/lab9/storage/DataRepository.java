package lab9.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable
    private List<SensorData> data = new ArrayList<>();

    public void addData(SensorData dataRecord){
        // TODO
        setChanged();
        data.add(dataRecord);
        notifyObservers(dataRecord);
        }

        // store data (e.g. in a List)
        // notifiy observers

    // TODO implement a method to get the stored data (needed by the strategies)
    public List<SensorData> getData() {
        return data;
    }
}


