package abstractFactory;

public class Main {
    private static final GuiFactory guiFactory = new JetBlackFactory();

    public static void main(String[] args) {

//        Button button = new JetBlackButton();
//        TextArea textArea = new JetBlackTextArea();

        ScrollBar scrollBar = guiFactory.createScrollBar();
        Button button = guiFactory.createButton();
        TextArea textArea = guiFactory.createTextArea();

        scrollBar.scroll();
    }
}
