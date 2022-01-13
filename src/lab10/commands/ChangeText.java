package lab10.commands;

import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class ChangeText implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int id;
    private String newText;
    private String oldText;

    public ChangeText(DiagramCanvas diagramCanvas, String id, String newText) {
        this.id = Integer.parseInt(id);
        this.newText = newText;
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        DiagramComponent diagramComponent = this.diagramCanvas.getComponent(id);
        oldText = diagramComponent.getText();
        diagramComponent.setText(newText);
    }

    @Override
    public void undo() {
        DiagramComponent diagramComponent = diagramCanvas.getComponent(id);
        diagramComponent.setText(oldText);
    }

    @Override
    public String toString() {
        return "ChangeText of component: " + id + " with text: " + newText;
    }
}
