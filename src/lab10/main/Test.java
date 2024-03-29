package lab10.main;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();

        // Execute various tests

        testDraw(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testTextAndColor(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testResize(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testConnect(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testAllCommands(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testSimpleUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testComplexUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));
    }

    private static void testDraw(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");

        client.showDiagram();
    }

    private static void testTextAndColor(Client client) {
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("draw rectangle");
        client.executeAction("change text", "0", "MyClass1");
        client.executeAction("change text", "5", "MyClass2");
        client.showDiagram();
    }

    private static void testConnect(Client client) {
        testDraw(client);
        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "4", "2");

        client.showDiagram();
    }

    private static void testResize(Client client) {
        testDraw(client);
        client.executeAction("resize", "2", "50");
        client.executeAction("resize", "3", "150");
        client.showDiagram();
    }

    private static void testAllCommands(Client client) {
        testTextAndColor(client);

        client.executeAction("resize", "2", "50");
        client.executeAction("resize", "3", "150");
        client.showDiagram();

        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "4", "2");

        client.executeAction("change color", "5", "YELLOW");

        client.showDiagram();
    }

    private static void testSimpleUndoRedo(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("change color", "0", "ORANGE");
        client.showDiagram();

        client.executeAction("draw rectangle");
        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();
    }

    private static void testComplexUndoRedo(Client client) {
        client.newDiagram();

        client.redo();
        client.executeAction("draw rectangle");
        client.showDiagram();
        client.undo();
        client.showDiagram();
        client.undo();
        client.redo();
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.showDiagram();

        client.executeAction("change color", "0", "YELLOW");
        client.executeAction("change color", "1", "RED");
        client.executeAction("change color", "2", "BLUE");
        client.showDiagram();

        client.undo();
        client.undo();
        client.redo();
        client.showDiagram();

        client.executeAction("change text", "0", "newText0");
        client.executeAction("change text", "1", "newText1");
        client.executeAction("change text", "2", "newText2");
        client.showDiagram();

        client.undo();
        client.undo();
        client.redo();
        client.showDiagram();

        client.executeAction("resize", "0", "200");
        client.executeAction("resize", "0", "300");
        client.showDiagram();

        client.undo();
        client.undo();
        client.redo();
        client.showDiagram();

        client.undo();
        client.undo();
        client.showDiagram();

        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "1", "2");
        client.executeAction("connect", "0", "2");
        client.showDiagram();

        client.undo();
        client.undo();
        client.redo();
        client.showDiagram();

        client.undo();
        client.undo();
        client.undo();
        client.undo();
        client.undo();
        client.undo();
        client.showDiagram();

        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.redo();
        client.showDiagram();
    }
}
