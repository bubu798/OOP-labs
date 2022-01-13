package lab9.storage;

import lab9.communication.ServerMessage;
import lab9.main.Utils;
import lab9.storage.SensorData;

import java.util.Observable;
import java.util.Observer;

public class ServerCommunicationController implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        SensorData newData = (SensorData) arg;
        ServerMessage serverMessage = new ServerMessage(newData.getStepsCount(),
                Utils.getClientId(),
                newData.getTimestamp());

        System.out.println("ServerCommunicationController: Server Message = " + serverMessage);
    }
}