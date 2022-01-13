package lab10.commands;

import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class ChangeColor implements DrawCommand {
    private int id;
    private String newColor;
    private DiagramCanvas diagramCanvas;
    private String oldColor;

    public ChangeColor(DiagramCanvas diagramCanvas, String id, String newColor) {
        this.id = Integer.parseInt(id);
        this.newColor = newColor;
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        DiagramComponent diagramComponent = diagramCanvas.getComponent(id);
        this.oldColor = diagramComponent.getColor();
        diagramComponent.setColor(newColor);
    }

    public void undo() {
        DiagramComponent diagramComponent = diagramCanvas.getComponent(id);
        diagramComponent.setColor(oldColor);
    }

    @Override
    public String toString() {
        return "ChangeColor of component: " + id + " with color: " + newColor;
    }
}
