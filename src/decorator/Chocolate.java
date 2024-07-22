package decorator;

public class Chocolate extends Goodies{
    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return baking.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + " с шоколадной присыпкой";
    }
}
