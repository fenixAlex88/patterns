package abstractFactory;

public abstract class GuiFactory {
    public abstract ScrollBar createScrollBar();
    public abstract Button createButton();
    public abstract TextArea createTextArea();
}
