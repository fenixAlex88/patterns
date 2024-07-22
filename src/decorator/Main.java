package decorator;

public class Main {
    public static void main(String[] args) {
        Baking baking = new Cake();
        baking.about();
//        System.out.println(baking.getDescription() + " " + baking.getPrice() + "$");
        baking = new Cream(baking);
        baking.about();
//        System.out.println(baking.getDescription() + " " + baking.getPrice() + "$");
        baking = new Chocolate(baking);
        baking.about();
//        System.out.println(baking.getDescription() + " " + baking.getPrice() + "$");
    }
}
