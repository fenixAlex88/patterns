package abstractFactory;

public class Main2 {
    private static GuiFactory guiFactory;

    public static void main(String[] args) {
        int style = 1;
        switch (style) {
            case 1:
                guiFactory = new JetBlackFactory();
                break;
            case 2:
                guiFactory = new RoseGoldFactory();
                break;
        }
        ScrollBar scrollBar = guiFactory.createScrollBar();
        scrollBar.scroll();
    }
}
