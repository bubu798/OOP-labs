package lab10.commands;

import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class Resize implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int id;
    private int percent;
    private int oldHeight;
    private int oldWeight;

    public Resize(DiagramCanvas diagramCanvas, String id, String percent) {
        this.diagramCanvas = diagramCanvas;
        this.id = Integer.parseInt(id);
        this.percent = Integer.parseInt(percent);
    }

    @Override
    public void execute() {
        DiagramComponent diagramComponent = diagramCanvas.getComponent(id);
        oldHeight = diagramComponent.getHeight();
        oldWeight = diagramComponent.getWeight();
        diagramComponent.setHeight(diagramComponent.getHeight() * percent / 100);
        diagramComponent.setWeight(diagramComponent.getWeight() * percent / 100);
    }

    @Override
    public void undo() {
        DiagramComponent diagramComponent = diagramCanvas.getComponent(id);
        diagramComponent.setHeight(oldHeight);
        diagramComponent.setWeight(oldWeight);
    }

    @Override
    public String toString() {
        return "Resize component: "+ id + " with: " + percent + "%";
    }
}
