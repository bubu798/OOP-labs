package lab10.main;

import lab10.commands.*;
import lab10.diagram.DiagramCanvas;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        diagramCanvas.show();
    }

    public void newDiagram() {
        diagramCanvas = new DiagramCanvas();
        invoker.restart();
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment:
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }

        // TODO - Execute the action
        invoker.execute(command);
    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.
        DrawCommand newDrawCommand = null;

        try {
            switch (type) {
                case DRAW_RECTANGLE -> newDrawCommand = new DrawRectangle(diagramCanvas);
                case CHANGE_COLOR -> newDrawCommand = new ChangeColor(diagramCanvas, args[0], args[1]);
                case CHANGE_TEXT -> newDrawCommand = new ChangeText(diagramCanvas, args[0], args[1]);
                case RESIZE -> newDrawCommand = new Resize(diagramCanvas, args[0], args[1]);
                case CONNECT -> newDrawCommand = new ConnectComponents(diagramCanvas, args[0], args[1]);
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Wrong type of argument");
        }

        return newDrawCommand;
    }

    public void undo(){
        invoker.undo();
    }

    public void redo() {
        invoker.redo();
    }
}
