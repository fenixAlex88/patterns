package decorator;

public class Cream extends Goodies{
    public Cream(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return baking.getPrice() + 12;
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + " с кремом";
    }
}
