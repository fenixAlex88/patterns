package decorator;

public class Cake implements Baking{
    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Торт";
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " " + getPrice() + "$");
    }
}
