package lab10.main;

import lab10.commands.*;

import java.util.Deque;
import java.util.LinkedList;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {
    private Deque<DrawCommand> commandsList = new LinkedList<>();
    private Deque<DrawCommand> undoCommandsList = new LinkedList<>();

    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
        commandsList = new LinkedList<>();
        undoCommandsList = new LinkedList<>();
    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        System.out.println(command);
        commandsList.push(command);
        command.execute();
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        if (commandsList.isEmpty()) {
            System.out.println("No command to undo");
        } else {
            DrawCommand toUndo = commandsList.pop();
            undoCommandsList.push(toUndo);
            System.out.println("Undo command: " + toUndo);
            toUndo.undo();
        }
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        if (undoCommandsList.isEmpty()) {
            System.out.println("No commands to redo");
        } else {
            DrawCommand command = undoCommandsList.pop();
            System.out.println("Redo: " + command);
            commandsList.push(command);
            command.execute();
        }

    }
}
