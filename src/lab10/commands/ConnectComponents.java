package lab10.commands;

import lab10.diagram.DiagramCanvas;

public class ConnectComponents implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int baseID;
    private int toConnectID;

    public ConnectComponents(DiagramCanvas diagramCanvas, String baseID, String toConnectID) {
        this.diagramCanvas = diagramCanvas;
        this.baseID = Integer.parseInt(baseID);
        this.toConnectID = Integer.parseInt(toConnectID);
    }

    @Override
    public void execute() {
        this.diagramCanvas.getComponent(baseID).connectTo(String.valueOf(toConnectID));
        this.diagramCanvas.getComponent(toConnectID).connectTo(String.valueOf(baseID));
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(baseID).removeConnection(String.valueOf(toConnectID));
        diagramCanvas.getComponent(toConnectID).removeConnection(String.valueOf(baseID));
    }

    @Override
    public String toString() {
        return "Connect component: " + baseID + " to component: " + toConnectID;
    }
}
