package abstractFactory;

public class RoseGoldFactory extends GuiFactory{
    @Override
    public ScrollBar createScrollBar() {
        return new RoseGoldScrollBar();
    }

    @Override
    public Button createButton() {
        return new RoseGoldButton();
    }

    @Override
    public TextArea createTextArea() {
        return new RoseGoldTextArea();
    }
}
